package com.ly.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @FileName:SpringConfig.class
 * @Author:ly
 * @Date:2022/5/16
 * @Description: 配置类代替配置文件
 */

//配置类注解
@Configuration
//开启组件扫描注解，参数为全类名
@ComponentScan(basePackages = {"com.ly.spring5.service","com.ly.spring5.dao"})
public class SpringConfig {

}
