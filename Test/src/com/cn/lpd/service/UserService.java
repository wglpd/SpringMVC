package com.cn.lpd.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.lpd.entity.User;
import com.cn.lpd.mapper.UserMapper;

@Service("userService")
public class UserService {
	
	@Resource
	private UserMapper userMapper;
	
	public User findUserById(int Id){
		return userMapper.selectByPrimaryKey(Id);
	}
}
