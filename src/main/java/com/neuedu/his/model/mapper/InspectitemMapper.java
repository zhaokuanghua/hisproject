package com.neuedu.his.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.his.model.bean.Inspectitem;

@Mapper
public interface InspectitemMapper {

	public List<Inspectitem> selectAllitems();
}
