/**
 * Project Name:microservicecloud-provider-dept-8001
 * File Name:DeptProvider8001_App.java
 * Package Name:com.bohua.springcloud
 * Date:下午2:35:00
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description: <br/>
 * Date: 下午2:35:00 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient // 服务发现
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
