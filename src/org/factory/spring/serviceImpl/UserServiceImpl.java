package org.factory.spring.serviceImpl;

import org.factory.spring.service.UserService;

public class UserServiceImpl implements UserService
{

	@Override
	public Integer addUser(String name, String password)
	{
		System.out.println("ģ������û�"+name);
		return 19;
	}

}
