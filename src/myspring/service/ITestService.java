package myspring.service;

import myspring.annotation.Admin;

public interface ITestService {

	@Admin(value="dasds")
	String sayHello(String str);
}
