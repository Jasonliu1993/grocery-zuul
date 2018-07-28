package com.jwebcoder.groceryzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GroceryZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroceryZuulApplication.class, args);
    }
}
