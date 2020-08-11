package com.neuedu.his.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.his.model.bean.Level;

@Mapper
public interface LevelMapper {

	public List<Level> selectAllLevel();
}
