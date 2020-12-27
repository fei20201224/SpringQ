package org.factory.spring.factory;

import org.factory.spring.service.UserService;
import org.factory.spring.serviceImpl.UserServiceImpl;
import org.factory.spring.serviceImpl.UserServiceSeniorImpl;

public class UserServiceFactory
{

	public static UserService getUserService()
	{
		// TODO Auto-generated method stub
		return new UserServiceSeniorImpl();
	}
	
}
