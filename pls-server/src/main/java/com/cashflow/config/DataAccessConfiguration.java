package com.cashflow.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DataAccessConfiguration {

	@Value("spring.datasource.username")
	private String userName;
	@Value("spring.datasource.password")
	private String password;
	@Value("spring.datasource.url")
	private String url;
	@Value("spring.datasource.driver-class-name")
	private String driverClassName;

	@Bean(destroyMethod = "close")
	public javax.sql.DataSource datasource() {
		
		org.apache.tomcat.jdbc.pool.DataSource ds = new org.apache.tomcat.jdbc.pool.DataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(userName);
		ds.setPassword(password);
		ds.setInitialSize(5);
		ds.setMaxActive(10);
		ds.setMaxIdle(5);
		ds.setMinIdle(2);
		return ds;
	}

	@Bean
	public JdbcOperations tpl() {
		return new JdbcTemplate(datasource());
	}
	
	

}
