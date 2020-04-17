package com.revature.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

public class LoggingAspect {

	private static Logger log = LogManager.getLogger(LoggingAspect.class);
	private long start;
	private long end;
	
	@Before("within(com.revature.model.*)")
	public void logModelMethods(JoinPoint jp) {
		log.info(jp.getTarget() + " invoked " + jp.getSignature());
	}
	
	@Before("within(com.revature.repository.*)")
	public void logrepoMethods(JoinPoint jp) {
		log.info(jp.getTarget() + " invoked " + jp.getSignature());
	}
	
	@Around("execution(* find*(..))&&within(com.revature.repository.*)")
	public Object logTime(ProceedingJoinPoint pjp) throws Throwable{
		long start, stop, total;
		start=System.currentTimeMillis();
		
		Object obj = (Object) pjp.proceed();
		stop=System.currentTimeMillis();
		
		total = stop - start;
		log.info("Excution time for " + " is " + total + "millisecond");
		
		return obj;
	}
	
	@AfterReturning(pointcut="execution(* find*(..))&&within(com.revature.*)", returning = "returnedObject")
	public void logFight(JoinPoint jp, Object returnedObject) {
		log.info(jp.getTarget() + " invoked "+jp.getSignature()+" returning "+returnedObject);
		
	}
	
}
