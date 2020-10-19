/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package org.cjy.controller;
 
import org.cjy.common.entity.RestfulResult;
import org.cjy.common.utils.CommUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.cjy.entity.ServiceInfo;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@RestController
@RequestMapping(value = "service")
public class ServiceController {
 
    @RequestMapping(value = "hello")
    public void login(HttpServletRequest request, HttpServletResponse response,
                      @RequestBody ServiceInfo serviceInfo) {
 
        RestfulResult restfulResult = new RestfulResult();
 
        try {
            restfulResult.setData("Service2:Welcome " + serviceInfo.getName() + "!");
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        CommUtils.printDataJason(response, restfulResult);
    }
 
    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo){
 
        return "Service2:Welcome " + serviceInfo.getName() + " !";
    }
}