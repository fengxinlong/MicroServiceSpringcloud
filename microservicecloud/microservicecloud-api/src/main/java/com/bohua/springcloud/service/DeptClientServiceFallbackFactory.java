/**
 * Project Name:microservicecloud-api
 * File Name:DeptClientServiceFallbackFactory.java
 * Package Name:com.bohua.springcloud.service
 * Date:下午3:13:30
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bohua.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

/**
 * Description: <br/>
 * Date: 下午3:13:30 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable arg0) {

        // Auto-generated method stub
        return new DeptClientService() {

            @Override
            public List<Dept> list() {

                // Auto-generated method stub
                return null;
            }

            @Override
            public Dept get(long id) {

                // Auto-generated method stub
                return new Dept().setDeptno(id).setDname("游客").setDb_source("请尽快注册");
            }

            @Override
            public boolean add(Dept dept) {

                // Auto-generated method stub
                return false;
            }
        };
    }

}
