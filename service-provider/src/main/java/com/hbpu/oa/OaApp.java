package com.hbpu.oa;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author xiayng on 2018/11/21.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.hbpu")
@EnableCaching
@EnableDubbo
public class OaApp {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication app = new SpringApplication(OaApp.class);
        app.run(args);
//        CountDownLatch latch = new CountDownLatch(1);
//        latch.await();
    }
}
