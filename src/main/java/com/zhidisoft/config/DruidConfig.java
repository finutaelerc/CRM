package com.zhidisoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidConfig {

	/**
	 * JAVA 配置
	 * @Bean 把一个 DruidDataSource(类) 放到spring容器中
	 * @return
	 */
	@Bean
	DruidDataSource dataSource() {
		DruidDataSource dds = new DruidDataSource();
		dds.setUrl("jdbc:oracle:thin:@192.168.14.120:1521:orcl");
		dds.setDriverClassName("oracle.jdbc.OracleDriver");
		dds.setUsername("0925");
		dds.setPassword("0925");
		return dds;
	}

}
