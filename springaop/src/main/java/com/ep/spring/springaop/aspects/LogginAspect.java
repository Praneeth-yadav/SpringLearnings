package com.ep.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {
	@Before("execution(* com.ep.spring.springaop.ProductServiceimpl.multiply(..))")
	public void logBefore(JoinPoint jointpoint) {
		System.out.println("Before calling the methos");

	}

	@After("execution(* com.ep.spring.springaop.ProductServiceimpl.multiply(..))")
	public void logAfter(JoinPoint jointpoint) {
		System.out.println("After calling the methos");

	}

}
