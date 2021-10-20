package com.douzone.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.weaver.tools.Traceable;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect2 {
	@Before("exexution(public com.douzone.aoptest.vo.ProductVo com.douzone.aoptest.service.ProductService.find)")
	public void beforeAdvice() {

	}

}
