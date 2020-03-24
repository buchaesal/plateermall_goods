package com.plateer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@SpringBootApplication
@EnableSwagger2
public class ShoppingGoodsBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(ShoppingGoodsBootApplication.class, args);
        log.error("hello");
    }
}
