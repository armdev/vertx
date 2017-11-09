package io.vertx.examples.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.vertx.examples.spring.common.Result;
import io.vertx.examples.spring.service.DeviceService;



@Controller
@RequestMapping(value = "/api/frontDevice/")
@Api(value = "FrontDeviceController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,description="安卓交互接口")
public class FrontDeviceController{
	
	@Autowired
	DeviceService deviceService;

	
    
    @ApiOperation(value="获取学校班级信息列表",notes = "")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "school_id", value = "学校ID", required = false, paramType = "header", dataType = "Int")
    })
    @ResponseBody
    @RequestMapping(value = "/getClassList",method = RequestMethod.GET)
    public Result getClassList()
    {
        return deviceService.getSchoolKey("");
    }
    
    @ApiOperation(value="新同学录入",notes = "")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "school_id", value = "学校ID", required = true, paramType = "header", dataType = "Int"),
    	@ApiImplicitParam(name = "class_id", value = "班级ID", required = true, paramType = "header", dataType = "Int"),
    	@ApiImplicitParam(name = "name", value = "学生姓名", required = true, paramType = "header", dataType = "String"),
    	@ApiImplicitParam(name = "gender", value = "学生性别：1-男、2-女", required = true, paramType = "header", dataType = "Int"),
    	@ApiImplicitParam(name = "birthday", value = "学生生日  格式：YYYYMMDD", required = true, paramType = "header", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/addStudent",method = RequestMethod.GET)
    public Result addStudent()
    {
        return deviceService.getSchoolKey("");
    }
    
    @ApiOperation(value="学生家长录入（一次一人）",notes = "")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "student_id", value = "学生ID", required = true, paramType = "header", dataType = "Int"),
    	@ApiImplicitParam(name = "phone", value = "家长手机号", required = true, paramType = "header", dataType = "String"),
    	@ApiImplicitParam(name = "relation", value = "关系ID列表：1-爸爸、2-妈妈、3-爷爷、4-奶奶、5-外公、6外婆、99-其他", required = true, paramType = "header", dataType = "Int"),
    	@ApiImplicitParam(name = "relation_title", value = "关系名称，当且仅当 relation 等于 99 时上传", required = false, paramType = "header", dataType = "String"),
    })
    @ResponseBody
    @RequestMapping(value = "/addParent",method = RequestMethod.GET)
    public Result addParent(@RequestHeader String deviceNo)
    {
    	return deviceService.getSchoolKey("");
    }
    
    @ApiOperation(value="提交学生已被接走信息2",notes = "",response=Result.class)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "student_id", value = "学生ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "parent_id", value = "家长ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "create_time", value = "接走时间 格式：YYYYMMDDHHMMSS", required = true, paramType = "body", dataType = "String"),
    	@ApiImplicitParam(name = "img[main]", value = "图像", required = true, paramType = "body", dataType = "File"),
    	@ApiImplicitParam(name = "img[sub]", value = "辅助图像", required = false, paramType = "body", dataType = "File"),
    })
    @ResponseBody
    @RequestMapping(value = "/submitTakeAway2",method = RequestMethod.GET)
    public Result submitTakeAway2(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
        return deviceService.getSchoolKey("");
    }
    
    
    /**
     * 
     * @param student_id
     * @param parent_id
     * @param create_time
     * @param file1
     * @param file2
     * @return
     * 
     *  array(
      'code' => 0, //  0 - 成功
      'message' => '', // code 不为 0 时的错误信息
      'data' => array( // code=88时返回
      'parent_id' => 111,
      'time' => '2016-05-05 05:05:05', //接走时间
      ),
      )
     */
    @ApiOperation(value="提交学生已被接走信息",notes = "",response=Result.class)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "student_id", value = "学生ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "parent_id", value = "家长ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "create_time", value = "接走时间 格式：YYYYMMDDHHMMSS", required = true, paramType = "body", dataType = "String"),
    	@ApiImplicitParam(name = "img", value = "图像", required = true, paramType = "body", dataType = "File"),
    })
    @ResponseBody
    @RequestMapping(value = "/submitTakeAway",method = RequestMethod.GET)
    public Result submitTakeAway(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    @ApiOperation(value="提交学校职工签到及签退信息",notes = "",response=Result.class)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "id", value = "职工ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "img", value = "图像", required = true, paramType = "body", dataType = "File"),
    	@ApiImplicitParam(name = "create_time", value = "接走时间 格式：YYYYMMDDHHMMSS", required = true, paramType = "body", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/submitStaffSign",method = RequestMethod.GET)
    public Result submitStaffSign(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    
    
    /**
     * 
     * @param student_id
     * @param parent_id
     * @param create_time
     * @param file1
     * @param file2
     * @return
     *  array(
      'code' => 0, //  0 - 成功 77-参数错误
      'message' => '', // code 不为 0 时的错误信息
      'data' => array( // code=0时返回
      
      // status状态包含81,82,83,84,86,88
      
      // 81：xx家长欢迎您（家长来接或学生到园）（上传）
      // 82：xx家长再见（家长接走学生）（上传）
      // 83：xx家长来接学生（已有家长来接，暂未接走）（上传）
      // 84：xx家长接走学生（需要调用上传接口,针对场景三）（上传）
      // 86：学生已经安全到园（上传）
      // 88：xx家长已经接走学生（不上传）
      
      // 99：谛达诺学校、不校验、默认通过，直接上传（上传）
      
      // 多次刷场景：
      // 400 超过次数，不入库
      // 401 正常次数，入库
      // 402 太频繁，不入库
       
      'status' => 81 ,
      'parent_id' => 111, // 家长ID
      'relation_title' => '爸爸',
      'create_time' => '2017-01-01 17:01:01',
      ),
      )
     
     */
    @ApiOperation(value="查询学生接走状态",notes = "",response=Result.class)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "student_id", value = "学生ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "parent_id", value = "家长ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "create_time", value = "接走时间 格式：YYYYMMDDHHMMSS", required = true, paramType = "body", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/validBrush",method = RequestMethod.GET)
    public Result validBrush(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
}