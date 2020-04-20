package com.zp.aop.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 用于记录日志的工具类，它里面提供了公共的代码
 */
@Component("logger")
// 表示当前类是一个切面类
@Aspect
public class Logger {

    @Pointcut("execution(* com.zp.aop.anno.service.impl.*.*(..))")
    private void pt1() {
    }

    /**
     * 用于打印日志：计划让其在切入点方法执行之前执行(切入点方法就是业务层方法)
     */
    @Before("pt1()")
    public void printLog() {
        System.out.println("Logger 类中的printLog方法开始记录日志了。。。。。。。");
    }

    @Around("pt1()")
    public void aroundPrintLog(ProceedingJoinPoint point) {
        Object retValue = null;

        try {
            Object[] objects = point.getArgs();

            System.out.println("Logger类中的aroundPrintLog方法开始记录日志了。。。前置");

            retValue = point.proceed(objects);

            System.out.println("Logger类中的aroundPrintLog方法开始记录日志了。。。后置");

        } catch (Throwable throwable) {
            System.out.println("Logger类中aroundPrintLog方法开始记录日志了。。。异常");
            throw new RuntimeException(throwable);
        } finally {
            System.out.println("Logger类中aroundPrintLog方法开始记录日志了。。。最终通知");

        }
    }
}
