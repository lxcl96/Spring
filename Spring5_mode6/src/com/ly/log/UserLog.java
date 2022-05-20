package com.ly.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @FileName:UserLog.class
 * @Author:ly
 * @Date:2022/5/20
 * @Description:
 */
public class UserLog {
    //使用日志类  参数为当前类的class类型
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("log info");
        log.debug("log debug");
        log.error("log error");
    }
}
