/**
 * Project Name:microservicecloud-eureka-7001
 * File Name:EurekaServer7001_App.java
 * Package Name:com.bohua.springcloud
 * Date:下午4:50:08
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description: <br/>
 * Date: 下午4:50:08 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
