package com.lyz.his.util;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
@Aspect
public class MyApect
{

    private static final Logger log = LoggerFactory.getLogger(MyApect.class);

    @Pointcut("execution(* com.lyz.his.controller.*.*(..))")
    public void start()
    {

    }

    @Before("start()")
    public void before(JoinPoint jp)
    {
        System.out.println("before:" + jp.toString());
        Signature signature = jp.getSignature();
//		获得当前执行方法的所属包名和类名
        String pname = signature.getDeclaringTypeName();
//		获得当前执行的方法名
        String mname = signature.getName();

//		log.debug("记录debug级别的信息");
//		log.info("记录info级别的信息");
//		log.warn("记录警告级别的信息");
//		log.error("记录error级别的信息");
//		log.trace("记录trace级别的信息");

//		System.out.println("当前执行的方法所属类名："+pname);
//		System.out.println("当前执行的方法名："+mname);

        log.debug("当前运行的类名：{},当前方法名：{}", pname, mname);
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = sra.getRequest();
        String remoteAddr = request.getRemoteAddr();
        log.debug("远程访问者的来源地址:{}", remoteAddr);

    }

    @AfterThrowing(pointcut = "start()", throwing = "ex")
    public void afterThrowing(JoinPoint joinpoint, Exception ex)
    {
        System.out.println("异常通知日志" + joinpoint.toString());
//      System.out.println(ex.getMessage());
        ex.printStackTrace();
    }

}
