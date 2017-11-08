package io.vertx.examples.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.vertx.examples.spring.common.Result;
import io.vertx.examples.spring.common.ResultGenerator;



@Controller
@RequestMapping(value = "/v1/api")
public class HomeApiController{

    //这里使用POST @RequestBody必须使用POST才能接收，这里方便讲解
    @ApiOperation(value = "一个测试API", notes = "第一个测试API")
    @ResponseBody
    @RequestMapping(value = "/test/{path}", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "blogArticleBeen", value = "文档对象", required = true, paramType = "body", dataType = "BlogArticleBeen"),
            @ApiImplicitParam(name = "path", value = "url上的数据", required = true, paramType = "path", dataType = "String"),
            @ApiImplicitParam(name = "query", value = "query类型参数", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "apiKey", value = "header中的数据", required = true, paramType = "header", dataType = "String")
    })
    public Result test(@RequestBody BlogArticleBeen blogArticleBeen,
                           @PathVariable String path,
                           String query,
                           @RequestHeader String apiKey,
                           PageInfoBeen pageInfoBeen){
        System.out.println("blogArticleBeen.getLastUpdateTime():"+blogArticleBeen.getLastUpdateTime());
        System.out.println("blogArticleBeen.getSorter():"+blogArticleBeen.getSorter());
        System.out.println("path:"+path);
        System.out.println("query:"+query);
        System.out.println("apiKey:"+apiKey);
        System.out.println("pageInfoBeen.getNowPage():"+pageInfoBeen.getNowPage());
        System.out.println("pageInfoBeen.getPageSize():"+pageInfoBeen.getPageSize());
        
        return ResultGenerator.genSuccessResult();
    }
    
    
    @ApiOperation(value="一个测试API",notes = "第一个测试api")
    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello()
    {
        return "hello";
    }
}