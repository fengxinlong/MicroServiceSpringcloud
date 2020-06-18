/**
 * Project Name:microservicecloud-consumer-dept-80
 * File Name:DeptController_Consumer.java
 * Package Name:com.bohua.springcloud.controller
 * Date:下午3:34:01
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bohua.springcloud.entities.Dept;
import com.bohua.springcloud.service.DeptClientService;

/**
 * Description: <br/>
 * Date: 下午3:34:01 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept) {
        return this.service.add(dept);
    }
}
