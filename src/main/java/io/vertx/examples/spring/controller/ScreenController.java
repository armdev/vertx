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
@RequestMapping(value = "/api/screen/")
@Api(value = "ScreenController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,description="显示屏接口")
public class ScreenController{
	
	@Autowired
	DeviceService deviceService;

	
    @ApiOperation(value="获取显示屏列表",notes = "",response=Result.class)
    @ApiImplicitParams({
    })
    @ResponseBody
    @RequestMapping(value = "/getScreenList",method = RequestMethod.GET)
    public Result getScreenList(Integer student_id,Integer parent_id,String create_time, @RequestBody MultipartFile file1,@RequestBody MultipartFile file2)
    {
    	return deviceService.getSchoolKey("");
    }
    
    
    
}