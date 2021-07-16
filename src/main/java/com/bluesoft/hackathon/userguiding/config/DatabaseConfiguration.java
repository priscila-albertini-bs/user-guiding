package com.bluesoft.hackathon.userguiding.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;

@Configuration
public class DatabaseConfiguration {

    @Bean
    public DataSource dataSource() throws Exception{
        String ipBanco = "127.0.0.1";
        int portaBanco = 1521;
        String nomeBanco = "xe";
        String usuarioBanco = "qa_homo";
        String senhaBanco = "qa_homo";

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@"+ipBanco+":"+portaBanco+":"+ nomeBanco);
        dataSource.setUsername(usuarioBanco);
        dataSource.setPassword(senhaBanco);
        return dataSource;
    }

}
