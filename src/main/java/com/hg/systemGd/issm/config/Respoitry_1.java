package com.hg.systemGd.issm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef="entityManagerFactoryPrimary",
        transactionManagerRef="transactionManagerPrimary",
        basePackages= { "com.hg.systemGd.issm.repository" })
public class Respoitry_1 {
    /**
     *
     */
    @Autowired
    private JpaProperties jpaProperties;

    @Autowired
    @Qualifier("ds1DataSource")
    private DataSource ds1DataSource;

    @Autowired
    private HibernateProperties hibernateProperties;

    @Bean(name = "entityManagerFirst")
    @Primary
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactory(builder).getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactoryPrimary")
    @Primary
    public LocalContainerEntityManagerFactoryBean entityManagerFactory (EntityManagerFactoryBuilder builder) {
        Map<String, Object> properties = hibernateProperties.determineHibernateProperties(
                jpaProperties.getProperties(), new HibernateSettings());
        return builder
                //设置数据源
                .dataSource(ds1DataSource)
                //设置数据源属性
                .properties(properties)
                //设置实体类所在位置.扫描所有带有 @Entity 注解的类
                .packages("com.hg.systemGd.issm.entity")
                // Spring会将EntityManagerFactory注入到Repository之中.有了 EntityManagerFactory之后,
                // Repository就能用它来创建 EntityManager 了,然后Entity就可以针对数据库执行操作
                .persistenceUnit("PersistenceUnit")
                .build();

    }



    @Bean(name = "transactionManagerPrimary")
    @Primary
    PlatformTransactionManager transactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactory(builder).getObject());
    }



}
