package com.neuedu.his;

import org.mybatis.generator.api.ShellRunner;

/**
 * 功能描述:自动生成mapper.xml、dao、entity
 * @author: zxz
 * @date: 2020年7月31日
 */
public class GetAutoEntityAndDao {

	// 该配置文件放在src\\main\\resources\\该路径下即可
	public static void main(String[] args) {
		args = new String[] { "-configfile", "src\\main\\resources\\mybatis-generator.xml", "-overwrite" };
		ShellRunner.main(args);
	}

}
