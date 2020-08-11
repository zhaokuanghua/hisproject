package com.neuedu.his.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.his.model.bean.Checkitem;

@Mapper
public interface CheckitemMapper {

	public List<Checkitem> selectAllciitems();
}
