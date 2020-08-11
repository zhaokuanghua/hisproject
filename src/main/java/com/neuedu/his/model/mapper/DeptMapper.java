package com.neuedu.his.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.his.model.bean.Dept;

@Mapper
public interface DeptMapper {

	
	public List<Dept> selectAllDept();
}
