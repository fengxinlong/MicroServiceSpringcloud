/**
 * Project Name:microservicecloud-consumer-dept-80
 * File Name:DeptConsumer80_App.java
 * Package Name:com.bohua.springcloud
 * Date:下午4:09:35
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description: <br/>
 * Date: 下午4:09:35 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = { "com.bohua.springcloud" })
@ComponentScan("com.bohua.springcloud")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
