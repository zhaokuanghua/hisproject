package com.neuedu.his.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.his.model.bean.User;

@Mapper
public interface UserMapper {

	public User login(User user);
}
