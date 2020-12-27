package org.factory.spring.action;

import org.factory.spring.factory.UserServiceFactory;
import org.factory.spring.service.UserService;

/**
 * @author CLF
 *
 */
public class UserAction
{
	private String username;
	private String password;
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	private UserService us;
	
	

	public UserAction(UserService us)
	{
		this.us = us;
	}
	
	
	
	public void  setAbc(String xxx) {
		
		System.out.println("ִ��setAbc����:"+xxx);
	}
	
	public String add() {
		//ʹ�ù���ģʽ
		
	//	UserService us = UserServiceFactory.getUserService();
		Integer id =  us.addUser(username,password);
		
		if(id>0) {
			
			return "SUCCESS!";
		}
		else return "ERROR!";
	}
}
