 package org.factory.spring.serviceImpl;

import org.factory.spring.service.UserService;

public class UserServiceSeniorImpl implements UserService
{

	@Override
	public Integer addUser(String name, String password)
	{
		System.out.println("���߼���UserService���");
		return 29;
	}

}
