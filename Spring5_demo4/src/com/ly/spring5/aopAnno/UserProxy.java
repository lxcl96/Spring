package com.ly.spring5.aopAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
/**
 * @FileName:UserProxy.class
 * @Author:ly
 * @Date:2022/5/18
 * @Description: 代理类
 */

@Component
@Aspect
@Order(1)
public class UserProxy {


    @Pointcut(value = "execution(* com.ly.spring5.aopAnno.User.add(..)))")
    public void pointyDemo() {}
    //前置通知
    @Before(value = "pointyDemo()")
    public void before() {
        System.out.println("before");
    }

    //最终通知  方法之后执行
    @After(value = "pointyDemo()")
    public void after() {
        System.out.println("after");
    }

    //后置通知  返回值之后执行
    @AfterReturning(value = "pointyDemo()")
    public void afterReturning() {
        System.out.println("AfterReturning");
    }

    //异常通知
    @AfterThrowing(value = "pointyDemo()")
    public void afterThrowing() {
        System.out.println("AfterThrowing");
    }


    //环绕通知  需要在里面定义
    @Around(value = "pointyDemo()")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
       // int i = 1/ 0;
        System.out.println("around 之前");

        //add方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后");
    }


}
