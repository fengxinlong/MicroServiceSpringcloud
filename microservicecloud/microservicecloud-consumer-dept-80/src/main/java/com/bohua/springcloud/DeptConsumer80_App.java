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
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
