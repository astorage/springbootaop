package com.java.springbootaop.controller;

import com.java.springbootaop.service.AopTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Boris
 * @date 2020/7/22 20:52
 */
@RestController
public class TestController {

    @Autowired
    private AopTestService aopTestService;

    @GetMapping("/aop/test")
    public void testAop(String param) {
        aopTestService.testAop(param);
        System.out.println("test aop controller " + param);
    }
}
