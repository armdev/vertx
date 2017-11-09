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
@RequestMapping(value = "/api/service/")
@Api(value = "CommonServiceController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,description="公共服务接口")
public class CommonServiceController{
	
	@Autowired
	DeviceService deviceService;

	
    @ApiOperation(value="提交学生未读消息",notes = "")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "app_id", value = "应用ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "key", value = "格式：AES（授权key+当前时间戳）", required = true, paramType = "body", dataType = "String"),
    	@ApiImplicitParam(name = "student_id", value = "学生ID", required = true, paramType = "body", dataType = "Int"),
    	@ApiImplicitParam(name = "content", value = "消息内容", required = true, paramType = "body", dataType = "String"),
    	@ApiImplicitParam(name = "url", value = "消息跳转的链接（完整的链接地址）", required = true, paramType = "body", dataType = "String"),
    })
    @ResponseBody
    @RequestMapping(value = "/submitStudentMessage",method = RequestMethod.GET)
    public Result submitStudentMessage()
    {
        return deviceService.getSchoolKey("");
    }
    
    
    /**
     * array(
          'code' => 0, //  0 - 成功
          'message' => '', // code 不为 0 时的错误信息
          'data' => array(
            'time' => 20160606060606, //当前系统时间
          )
        )
     */
    @ApiOperation(value="获取服务器时间",notes = "")
    @ApiImplicitParams({
//    	@ApiImplicitParam(name = "timestamp", value = "时间戳，用于增量更新，格式：YYYYMMDDHHMMSS", required = false, paramType = "header", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/getSystemTime",method = RequestMethod.GET)
    public Result getSystemTime()
    {
        return deviceService.getSchoolKey("");
    }
    
    @ApiOperation(value="获取设备程序信息",notes = "")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "device_no", value = "当前设备的编号", required = true, paramType = "header", dataType = "String"),
    	@ApiImplicitParam(name = "model", value = "当前设备的型号", required = true, paramType = "header", dataType = "String"),
    	@ApiImplicitParam(name = "system_type", value = "ID关系:1-robot_android、2-robot_linux、3-gates_linux", required = true, paramType = "header", dataType = "Int"),
    	@ApiImplicitParam(name = "version", value = "当前版本,可以为空", required = false, paramType = "header", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/getVersion",method = RequestMethod.GET)
    public Result getVersion()
    {
    	return deviceService.getSchoolKey("");
    }
    
    
    @ApiOperation(value="生成二维码图片",notes = "")
    @ApiImplicitParams({
//    	@ApiImplicitParam(name = "timestamp", value = "时间戳，用于增量更新，格式：YYYYMMDDHHMMSS", required = false, paramType = "header", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/createQrcode",method = RequestMethod.GET)
    public Result createQrcode()
    {
    	return deviceService.getSchoolKey("");
    }
 
    @ApiOperation(value="batchCreateStaffOldPng",notes = "",response=Result.class)
    @ApiImplicitParams({
    })
    @ResponseBody
    @RequestMapping(value = "/batchCreateStaffOldPng",method = RequestMethod.GET)
    public Result batchCreateStaffOldPng(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    @ApiOperation(value="identifyStaffPng",notes = "",response=Result.class)
    @ApiImplicitParams({
    })
    @ResponseBody
    @RequestMapping(value = "/identifyStaffPng",method = RequestMethod.GET)
    public Result identifyStaffPng(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    
    @ApiOperation(value="identifyParentPng",notes = "",response=Result.class)
    @ApiImplicitParams({
    })
    @ResponseBody
    @RequestMapping(value = "/identifyParentPng",method = RequestMethod.GET)
    public Result identifyParentPng(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    
    @ApiOperation(value="batchCreateParentQrcode",notes = "",response=Result.class)
    @ApiImplicitParams({
    })
    @ResponseBody
    @RequestMapping(value = "/batchCreateParentQrcode",method = RequestMethod.GET)
    public Result batchCreateParentQrcode(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    @ApiOperation(value="微信消息接口",notes = "",response=Result.class)
    @ApiImplicitParams({
    })
    @ResponseBody
    @RequestMapping(value = "/weiChat",method = RequestMethod.GET)
    public Result weiChat(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
}