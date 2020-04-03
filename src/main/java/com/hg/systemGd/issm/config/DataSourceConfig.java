package com.hg.systemGd.issm.config;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


@Configuration
@PropertySource(value = "classpath:application.properties",ignoreResourceNotFound = true,encoding = "UTF-8")
public class DataSourceConfig {
    private static Logger logger = Logger.getLogger(DataSourceConfig.class);


    @Bean(name="ds1DataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.test1")
    public DataSource dataSource(){
        return dataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean(name="dataSourceProperties")
    @ConfigurationProperties(prefix="spring.datasource.test1")
    public DataSourceProperties dataSourceProperties(){
        return new DataSourceProperties();
    }







}
