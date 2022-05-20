package com.ly.fullAnnotation.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @FileName:SpringConfig.class
 * @Author:ly
 * @Date:2022/5/20
 * @Description:
 */
@ComponentScan(basePackages = "com.ly.fullAnnotation")
@Configuration
@EnableTransactionManagement //开启事务管理器  就是xml中的创建事务管理器DataSourceTransactionManager
public class SpringConfig {

    //注解创建数据库连接池 对象 ，使用bean注解 表示对象不是由自己做而是由spring创建，但是配置需要在方法中配置
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///user_db");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        return dataSource;
    }

    //创建jdbcTemplate模板
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        /*如果没有传递参数 可以直接调用getDruidDataSource()方法，但是这样会产生一个问题
            因为@Bean注解spring会创建一个对象A
            调用这个方法又会创建一个对象B 那么A就没有用到，spring中就有两个对象了
            jdbcTemplate.setDataSource(getDruidDataSource());

         */

        //推荐使用参数传递 由于有注解@Bean 则参数就表示spring会根据类型自动注入进来
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
