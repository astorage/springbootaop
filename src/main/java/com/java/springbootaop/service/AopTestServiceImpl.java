package com.java.springbootaop.service;

import org.springframework.stereotype.Service;

/**
 * @author Boris
 * @date 2020/7/22 21:28
 */
@Service
public class AopTestServiceImpl implements AopTestService {
    @Override
    public String testAop(String param) {
        System.out.println("test aop service " + param);
        return param;
    }
}
