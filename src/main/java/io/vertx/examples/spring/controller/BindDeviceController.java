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
@RequestMapping(value = "/api/bindDevice/")
@Api(value = "BindDeviceController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,description="绑定客户端相关接口")
public class BindDeviceController{
	
	@Autowired
	DeviceService deviceService;

	
    
    @ApiOperation(value="同步学生和家长信息到绑定终端",notes = "")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "school_id", value = "学校ID", required = true, paramType = "header", dataType = "String"),
    	@ApiImplicitParam(name = "timestamp", value = "时间戳，用于增量更新，格式：YYYYMMDDHHMMSS", required = false, paramType = "body", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/getStudentList",method = RequestMethod.GET)
    public Result getStudentList()
    {
        return deviceService.getSchoolKey("");
    }
    
    @ApiOperation(value="同步学生和家长信息到绑定终端",notes = "")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "school_id", value = "学校ID", required = true, paramType = "header", dataType = "String"),
    	@ApiImplicitParam(name = "timestamp", value = "时间戳，用于增量更新，格式：YYYYMMDDHHMMSS", required = false, paramType = "body", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/getStaffList",method = RequestMethod.GET)
    public Result getStaffList()
    {
    	return deviceService.getSchoolKey("");
    }
    
   
    
    @ApiOperation(value="家庭成员和IC卡号绑定",notes = "")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "parent_id", value = "家长ID", required = true, paramType = "header", dataType = "Int"),
        @ApiImplicitParam(name = "student_id", value = "学生ID", required = true, paramType = "header", dataType = "Int"),
        @ApiImplicitParam(name = "rfid", value = "IC卡号", required = true, paramType = "header", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/bindParentRfid",method = RequestMethod.GET)
    public Result bindParentRfid(@RequestHeader String deviceNo)
    {
    	return deviceService.getSchoolKey("");
    }
    
    @ApiOperation(value="学校职工和IC卡号绑定",notes = "")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "id", value = "职工对应的唯一ID", required = true, paramType = "header", dataType = "Int"),
    	@ApiImplicitParam(name = "rfid", value = "IC卡号", required = true, paramType = "header", dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/bindStaffRfid",method = RequestMethod.GET)
    public Result bindStaffRfid(@RequestHeader String deviceNo)
    {
    	return deviceService.getSchoolKey("");
    }
}