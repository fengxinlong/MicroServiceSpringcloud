/**
 * Project Name:microservicecloud-consumer-hystrix-dashboard
 * File Name:DeptConsumer_DashBoard_App.java
 * Package Name:com.bohua.springcloud
 * Date:下午3:58:07
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Description: <br/>
 * Date: 下午3:58:07 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@SpringBootApplication

// 图形化界面
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
    }
}
