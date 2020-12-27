package org.factory.spring.serviceImpl;

import org.factory.spring.service.UserService;

public class UserServiceImpl implements UserService
{

	@Override
	public Integer addUser(String name, String password)
	{
		System.out.println("模拟添加用户"+name);
		return 19;
	}

}
