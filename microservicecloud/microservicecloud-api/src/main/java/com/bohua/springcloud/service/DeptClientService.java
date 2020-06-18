/**
 * Project Name:microservicecloud-api
 * File Name:DeptClientService.java
 * Package Name:com.bohua.springcloud.service
 * Date:上午11:52:46
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bohua.springcloud.entities.Dept;

/**
 * Description: 修改microservicecloud-api工程， DeptClientService接口在注解@FeignClient中添加
 * fallbackFactory属性值 Date: 上午11:52:46 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */

@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}
