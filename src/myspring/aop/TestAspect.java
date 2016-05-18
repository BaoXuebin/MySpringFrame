package myspring.aop;

import java.lang.reflect.Method;

import myspring.annotation.Admin;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect @Component
public class TestAspect {

	@Before("execution(* myspring.service.ITestService.sayHello(..))")
	public void cutServiceBefore() {
		System.out.println("cut service before");
	}
	
	@After("execution(* myspring.service.ITestService.sayHello(..))")
	public void cutServiceAfter() {
		System.out.println("cut service after");
	}
	
	@Before("@annotation(myspring.annotation.Admin)")
	public void beforeExecute(JoinPoint joinpoint) {
		MethodSignature ms = (MethodSignature) joinpoint.getSignature();
		Method method = ms.getMethod();
		System.out.println(ms);
		System.out.println(method.getAnnotation(Admin.class).value());
	}
}
