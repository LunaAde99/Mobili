package com.example.demo;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class DatabaseConfig {
	@Bean
	public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/world"); //percorso database
        dataSource.setUsername("root"); //user database
        dataSource.setPassword("LunaAdelunalovegood99!"); //password database
        return dataSource;
    }

}