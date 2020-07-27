package com.java.springbootaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Boris
 * @date 2020/7/22 20:18
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(public * com.java.springbootaop.service.AopTestService.*(..))") // the pointcut expression
    private void testServicePointcut() {} // the pointcut signature

    @Pointcut("execution(public * com.java.springbootaop.controller.TestController.*(..))") // the pointcut expression
    private void testControllerPointcut() {}

    @Pointcut("testServicePointcut() || testControllerPointcut()") // the pointcut expression
    private void testpointcut() {}

    @Around("testpointcut()")
    public void aroundm(ProceedingJoinPoint pjp) {
        System.out.println("aop around before");

        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("aop around after");
    }
}
