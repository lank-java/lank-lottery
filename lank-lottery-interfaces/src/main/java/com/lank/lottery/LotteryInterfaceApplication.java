package com.lank.lottery;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LanceLan
 * @since 2021-08-26 11:18
 */
@SpringBootApplication
@MapperScan("com.lank.lottery.dao")
@Configurable
@EnableDubbo
public class LotteryInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryInterfaceApplication.class, args);
    }
}
