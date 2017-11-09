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
@RequestMapping(value = "/api/student/")
@Api(value = "StudentController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,description="学生接口")
public class StudentController{
	
	@Autowired
	DeviceService deviceService;

	
    /**
     *  array(
      'code' => 0, //  0 - 成功
      'message' => '', // code 不为 0 时的错误信息
      'data_len' => '0000123456', // 返回json数据总长度。（10位，不足，前面用0补充）
      'data' => array(
      'school_id' => 23 , // 幼儿园ID
      'school_title' => '幼儿园名称', //幼儿园名称
      'student' => array(
      array(
      'id' => 999, // 唯一ID
      'class_id' => 67, //班级ID
      'class_title' => '班级名称', //班级名称
      'name' => '小诺',  //姓名
      'gender' => 1, //性别 1 - 男 2 - 女
      'birthday' => '2015-11-28', //生日
      'is_registered' => 0, //是否已在终端注册：0-否、1-是
      ),
      array(
      'id' => 999, // 唯一ID
      'class_id' => 67, //班级ID
      'class_title' => '班级名称', //班级名称
      'name' => '小诺',  //姓名
      'gender' => 1, //性别 1 - 男 2 - 女
      'birthday' => '2015-11-28', //生日
      'is_registered' => 0, //是否已在终端注册：0-否、1-是
      )
      )
      )
      )
      
     * @return
     */
    @ApiOperation(value="获取学生信息列表",notes = "")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "schoo_id	", value = "学校ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "timestamp", value = "时间戳，用于增量更新，格式：YYYYMMDDHHMMSS", required = true, paramType = "body", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/getStudentList",method = RequestMethod.GET)
    public Result getStudentList()
    {
        return deviceService.getSchoolKey("");
    }
    
    
    /**
     * array(
      'code' => 0, //  0 - 成功
      'message' => '', // code 不为 0 时的错误信息
      'data_len' => '0000123456', // 返回json数据总长度。（10位，不足，前面用0补充）
      'data' => array(
      'school_id' => 23 , // 幼儿园ID
      'school_title' => '幼儿园名称', //幼儿园名称
      'student' => array(
      {
      "student_id": "733",  //学生ID
      "height": "996",  //当天身高
      "weight": "17659",  //当天体重
      "daytime": "2017-10-18 07:53:15"
      },
      {
      "student_id": "642",
      "height": "1138",
      "weight": "18629",
      "daytime": "2017-10-18 07:58:48"
      }
      )
      )
      )
     * @return
     */
    @ApiOperation(value="获取学生体检信息",notes = "不用POST传递参数，header传Device-No即可")
    @ApiImplicitParams({
//    	@ApiImplicitParam(name = "timestamp", value = "时间戳，用于增量更新，格式：YYYYMMDDHHMMSS", required = false, paramType = "header", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/getStudentPE",method = RequestMethod.GET)
    public Result getStudentPE()
    {
        return deviceService.getSchoolKey("");
    }
    
    /**
     * array(
           'code' => 0 , // 0 -成功，1 -失败
           'message' => '' , // code 不为 0 时的错误信息
           'data' => array(123,456,789)
     * @return
     */
    @ApiOperation(value="获取黑名单",notes = "")
    @ApiImplicitParams({
//    	@ApiImplicitParam(name = "timestamp", value = "时间戳，用于增量更新，格式：YYYYMMDDHHMMSS", required = false, paramType = "header", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/getStudentBlackList",method = RequestMethod.GET)
    public Result getStudentBlackList()
    {
    	return deviceService.getSchoolKey("");
    }
    
    
    /**
     * array(
           'code' => 0 , // 0 -成功，1 -失败
           'message' => '' , // code 不为 0 时的错误信息
           'data' => 'ok!' ,
      )
     * @return
     */
    @ApiOperation(value="删除黑名单",notes = "")
    @ApiImplicitParams({
//    	@ApiImplicitParam(name = "timestamp", value = "时间戳，用于增量更新，格式：YYYYMMDDHHMMSS", required = false, paramType = "header", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/deletedStudentBlackList",method = RequestMethod.GET)
    public Result deletedStudentBlackList()
    {
    	return deviceService.getSchoolKey("");
    }
 
    /**
     * @return
     * array(
      'code' => 0, //  0 - 成功
      'message' => '', // code 不为 0 时的错误信息
      'data' => array(
      'id' => 11111, //服务器检测数据标识ID
      ),
      )
     */
    @ApiOperation(value="上传学生检测信息",notes = "该接口通过 POST 传值，采用标准浏览器提交表单含文件域机制",response=Result.class)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "id", value = "学生ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "height", value = "身高，单位：毫米", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "weight", value = "体重，单位：克", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "temperature", value = "体温，单位：度", required = true, paramType = "body", dataType = "Float"),
    	@ApiImplicitParam(name = "state_type", value = "检测信息状态：1-红色、2-黄色、3-绿色", required = false, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "recognition_type", value = "识别类型", required = false, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "env_temperature", value = "环境温度，单位：度", required = true, paramType = "body", dataType = "Float"),
    	@ApiImplicitParam(name = "raw_temperature", value = "原始温度，单位：度", required = true, paramType = "body", dataType = "Float"),
    	@ApiImplicitParam(name = "temperature_threshold", value = "体温阈值，单位：度", required = true, paramType = "body", dataType = "Float"),
    	@ApiImplicitParam(name = "img_id", value = "图像标识ID", required = true, paramType = "body", dataType = "String"),
    	@ApiImplicitParam(name = "img", value = "学生检测图像", required = true, paramType = "body", dataType = "File"),
    })
    @ResponseBody
    @RequestMapping(value = "/putStudentDetection",method = RequestMethod.POST)
    public Result putStudentDetection(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
        return deviceService.getSchoolKey("");
    }
    @ApiOperation(value="上传未认出学生检测信息到认领库",notes = "该接口通过 POST 传值，采用标准浏览器提交表单含文件域机制",response=Result.class)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "height", value = "身高，单位：毫米", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "weight", value = "体重，单位：克", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "temperature", value = "体温，单位：度", required = true, paramType = "body", dataType = "Float"),
    	@ApiImplicitParam(name = "state_type", value = "检测信息状态：1-红色、2-黄色、3-绿色", required = false, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "recognition_type", value = "识别类型", required = false, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "env_temperature", value = "环境温度，单位：度", required = true, paramType = "body", dataType = "Float"),
    	@ApiImplicitParam(name = "raw_temperature", value = "原始温度，单位：度", required = true, paramType = "body", dataType = "Float"),
    	@ApiImplicitParam(name = "temperature_threshold", value = "体温阈值，单位：度", required = true, paramType = "body", dataType = "Float"),
    	@ApiImplicitParam(name = "img_id", value = "图像标识ID", required = true, paramType = "body", dataType = "String"),
    	@ApiImplicitParam(name = "img", value = "学生检测图像", required = true, paramType = "body", dataType = "File"),
    	@ApiImplicitParam(name = "create_time", value = "检测时间 格式：YYYYMMDDHHMMSS", required = false, paramType = "body", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/putDetectionClaim",method = RequestMethod.POST)
    public Result putDetectionClaim(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    
    
    /**
     * 
      array(
      'code' => 0, //  0 - 成功
      'message' => '', // code 不为 0 时的错误信息
      'data' => array(
      array(
      'student_id' => 111,      //学生ID
      'img_id' => 111,          //图片ID
      'match' => 0,             //不匹配
      'created' => 12222222222, //退回时间戳（单位为秒）
      ),
      array(
      'student_id' => 111,      //学生ID
      'img_id' => 111,          //图片ID
      'match' => 1,             //匹配
      'created' => 12333333333, //匹配时间戳（单位为秒）
      ),
      )
      )
     */
    @ApiOperation(value="获取认领库数据",notes = "",response=Result.class)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "school_id", value = "学校ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "timestamp", value = "时间戳 格式：YYYYMMDDHHMMSS", required = false, paramType = "body", dataType = "String"),
    })
    @ResponseBody
    @RequestMapping(value = "/getStudentClaimData",method = RequestMethod.GET)
    public Result getStudentClaimData(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    @ApiOperation(value="上传红黄绿检测结果",notes = "",response=Result.class)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "detection_id", value = "服务器检测数据标识ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "result", value = "检测结果：1-红色、2-黄色、3-绿色", required = true, paramType = "body", dataType = "Int")
    })
    @ResponseBody
    @RequestMapping(value = "/putHandheldResult",method = RequestMethod.GET)
    public Result putHandheldResult(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    
    
    @ApiOperation(value="上传红黄绿检测图像",notes = "注：该接口通过 POST 传值，采用标准浏览器提交表单含文件域机制",response=Result.class)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "detection_id", value = "服务器检测数据标识ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "img", value = "检测图像", required = true, paramType = "body", dataType = "File")
    })
    @ResponseBody
    @RequestMapping(value = "/putHandheldImg",method = RequestMethod.GET)
    public Result putHandheldImg(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    
    @ApiOperation(value="上传学生已在终端注册结果",notes = "",response=Result.class)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "student_id", value = "学生标识ID", required = true, paramType = "body", dataType = "Int"),
    })
    @ResponseBody
    @RequestMapping(value = "/putStudentRegistered",method = RequestMethod.GET)
    public Result putStudentRegistered(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
}