package com.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com")
@PropertySource("classpath:db.properties")
@EnableWebMvc
public class WebConfig {
	@Autowired
	Environment env;
	
	@Bean
	public LocalSessionFactoryBean getFactory() {
		System.out.println("3...configuration...localsessionFactory");
		LocalSessionFactoryBean lsf=new LocalSessionFactoryBean();
		lsf.setDataSource(datasource());
		lsf.setHibernateProperties(hibernateprop());
		lsf.setPackagesToScan("com.model");
		return lsf;
	}
	
	public DataSource datasource() {
		System.out.println("4...configuration...datasource");
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName(env.getRequiredProperty("database.driver"));
		d.setUrl( env.getRequiredProperty("database.url"));
		d.setUsername( env.getRequiredProperty("database.user"));
		d.setPassword(env.getRequiredProperty("database.password"));
		return d;
	}
	
	public Properties hibernateprop() {
		System.out.println("5...configuration...properties HB");
		Properties p=new Properties();
		p.put("hibernate.dialect",env.getRequiredProperty("hibernate.dialect") );
		p.put("hibernate.show_sql",env.getRequiredProperty("hibernate.show_sql"));
		p.put("hibernate.format_sql",env.getRequiredProperty("hibernate.format_sql"));
		p.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
		return p;
	}
	@Bean
	public InternalResourceViewResolver getView() {
		System.out.println("6..configuration...internalResourceviewResolver");
		InternalResourceViewResolver irv=new InternalResourceViewResolver();
		irv.setPrefix("/WEB-INF/");
		irv.setSuffix(".jsp");
		return irv;
	}
}
