package myspring.test;

import myspring.service.ITestService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/applicationContext.xml")
public class JunitTest {

	@Autowired
	private ITestService testService;
	
	@Test
	public void testSayHello() {
		String str = testService.sayHello("BaoXuebin");
		System.out.println(str);
	}
	
}
