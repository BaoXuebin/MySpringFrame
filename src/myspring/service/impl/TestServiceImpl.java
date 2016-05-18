package myspring.service.impl;

import org.springframework.stereotype.Service;

import myspring.annotation.Admin;
import myspring.service.ITestService;

@Service
public class TestServiceImpl implements ITestService {

	@Override
	@Admin(value="ssssssssssss")
	public String sayHello(String str) {
		return "Hello " + str; 
	}

}
