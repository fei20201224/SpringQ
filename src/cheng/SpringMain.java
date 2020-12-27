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
	    ua.add("����", "12123");*/
	    
		//����Spring����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserAction ua = (UserAction)ctx.getBean("userAction");
		
		ua.setUsername("����");
		ua.setPassword("213232ll");
		ua.add();
		}

}
