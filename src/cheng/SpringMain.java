package cheng;

import org.factory.spring.action.UserAction;
import org.factory.spring.factory.UserServiceFactory;
import org.factory.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain
{

	public static void main(String[] args)
	{
		
		/*UserAction ua = new UserAction();
	    ua.add("张三", "12123");*/
	    
		//创建Spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserAction ua = (UserAction)ctx.getBean("userAction");
		
		ua.setUsername("张三");
		ua.setPassword("213232ll");
		ua.add();
		}

}
