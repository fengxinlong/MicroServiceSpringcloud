/**
 * Project Name:microservicecloud-config-client-3355
 * File Name:ConfigClientRest.java
 * Package Name:com.bohua.springcloud
 * Date:上午11:29:33
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: <br/>
 * Date: 上午11:29:33 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@RestController
public class ConfigClientRest {
    // 读配置文件相应信息
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        String str = "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
        System.out.println("******str: " + str);
        return "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
    }

}
