package org.zyf.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合MyBatis Plus
 * 1. 导入依赖 （springboot starter）
 * 2， 配置	数据源（数据库驱动，配置数据源）
 * 			Mybatis Plus (Mapperscan， sql映射文件)
 */

@MapperScan("org.zyf.product.dao")
@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

}
