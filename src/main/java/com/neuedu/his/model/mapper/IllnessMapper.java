package com.neuedu.his.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.his.model.bean.Illness;

@Mapper
public interface IllnessMapper {

	public List<Illness> selectAllillness();
}
