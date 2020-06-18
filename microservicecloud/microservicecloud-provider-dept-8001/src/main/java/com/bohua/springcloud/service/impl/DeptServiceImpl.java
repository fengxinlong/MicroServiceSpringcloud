/**
 * Project Name:microservicecloud-provider-dept-8001
 * File Name:DeptServiceImpl.java
 * Package Name:com.bohua.springcloud.service.impl
 * Date:下午2:13:43
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bohua.springcloud.dao.DeptDao;
import com.bohua.springcloud.entities.Dept;
import com.bohua.springcloud.service.DeptService;

/**
 * Description: <br/>
 * Date: 下午2:13:43 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {

        // Auto-generated method stub
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {

        // Auto-generated method stub
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {

        // Auto-generated method stub
        return dao.findAll();
    }

}
