package cn.wyc.trans_halfAuto3;

import java.util.List;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	@Test
	public void demo1() {
		String xmlPath = "applicationContext.xml";
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
		AccountService as = cp.getBean("ProxyAccountServiceId" ,AccountService.class);
		as.transfer("jack", "rose", 1000);
	}
}
