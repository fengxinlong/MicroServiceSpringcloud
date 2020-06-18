/**
 * Project Name:microservicecloud-consumer-dept-80
 * File Name:ConfigBean.java
 * Package Name:com.bohua.springcloud.cfgbeans
 * Date:下午3:21:38
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * Description: <br/>
 * Date: 下午3:21:38 <br/>
 * 
 * @author iscream
 * @version
 * @see
 * 
 * 
 * @Configuration 与类名 = spring application.xml
 */
@Configuration
public class ConfigBean { // boot --->spring applicationContext.xml
    @Bean // ---@Configuration配置
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        // 用我们重新选择的随机算法替代默认的轮询
        return new RandomRule();
    }

}

// @Bean
// public UserService getUserService(){
// return new UserServiceImpl();
// }

// applicationContext.xml == ConfigBean(@Configuration)
// <bean id="userService" class="com.bohua.tmall.UserServiceImpl">
