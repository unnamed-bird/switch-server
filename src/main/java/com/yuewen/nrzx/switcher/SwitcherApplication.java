package com.yuewen.nrzx.switcher;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * project : switch-server
 *
 * @author dalao
 */
@SpringBootApplication
@EnableTarsServer
@EnableCaching
public class SwitcherApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwitcherApplication.class, args);
    }
}
