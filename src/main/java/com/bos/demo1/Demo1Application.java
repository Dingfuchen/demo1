package com.bos.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {
    private static Logger logger = LoggerFactory.getLogger(ReadingListRepository.class);
    public static void main(String[] args) {
        logger.debug("测试中Demo1Application");
        SpringApplication.run(Demo1Application.class, args);
    }
}
