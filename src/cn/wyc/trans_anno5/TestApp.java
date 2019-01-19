package cn.wyc.trans_anno5;

import java.util.List;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	@Test
	public void demo1() {
		String xmlPath = "applicationContext.xml";
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
		AccountService as = cp.getBean("AccountServiceId" ,AccountService.class);
		as.transfer("jack", "rose", 1000);
	}
}
