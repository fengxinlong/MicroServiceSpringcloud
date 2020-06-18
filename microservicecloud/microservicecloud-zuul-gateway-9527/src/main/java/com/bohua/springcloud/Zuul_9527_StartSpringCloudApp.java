/**
 * Project Name:microservicecloud-zuul-gateway-9527
 * File Name:Zuul_9527_StartSpringCloudApp.java
 * Package Name:com.bohua.springcloud
 * Date:‰∏ãÂçà4:37:20
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Description: <br/>
 * Date: ∑ÎˆŒ¡˙4:37:20 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
    }
}
