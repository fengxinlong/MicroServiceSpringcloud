/**
 * Project Name:microservicecloud-provider-dept-8001
 * File Name:DeptDao.java
 * Package Name:com.bohua.springcloud.dao
 * Date:下午1:59:31
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bohua.springcloud.entities.Dept;

/**
 * Description: <br/>
 * Date: 下午1:59:31 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
