package com.JDBC_Configuration_Without_XML;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfig {


	@Bean(name = {"ds" ,"DMDS" })
	public DataSource getDataSource()
	{
		DriverManagerDataSource DMDS = new DriverManagerDataSource();
		DMDS.setDriverClassName("com.mysql.cj.jdbc.Driver");
		DMDS.setUrl("jdbc:mysql://localhost:3306/springjdbcDB");
		DMDS.setUsername("root");
		DMDS.setPassword("root");
		return DMDS;
		
	}
	
	
	@Bean
	public StudentDAOImpl getStudentDAOImpl()
	{
		StudentDAOImpl studDaoImpl = new StudentDAOImpl();
		studDaoImpl.setDataSource(getDataSource());
		return studDaoImpl ;
		
	}
	
	
	
	
	/*
	<bean
	class="org.springframework.jdbc.datasource.DriverManagerDataSource"
	name="dataSource">

	<property name="driverClassName"
		value="com.mysql.cj.jdbc.Driver" />
	<property name="url"
		value="jdbc:mysql://localhost:3306/springjdbcDB" />
	<property name="username" value="root" />
	<property name="password" value="root" />

</bean>

<bean id = "studentDAOImpl" 
  class = "com.MainPackge.StudentDAOImpl">
  <property name = "dataSource" ref = "dataSource" />    
</bean>

<!-- Definition for studentJDBCTemplate bean -->

<!-- 
<bean class="org.springframework.jdbc.core.JdbcTemplate"
	name="studentJDBCTemplate" p:DataSource-ref="dataSource" />


<bean class="com.MainPackge.StudentDAOImpl" name="studDAO">
	<property name="jdbcTemplate" ref="studentJDBCTemplate" />
</bean>


*/

}
