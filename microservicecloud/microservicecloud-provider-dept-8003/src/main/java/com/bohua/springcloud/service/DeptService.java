/**
 * Project Name:microservicecloud-provider-dept-8001
 * File Name:DeptService.java
 * Package Name:com.bohua.springcloud.service
 * Date:下午2:11:07
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud.service;

import java.util.List;

import com.bohua.springcloud.entities.Dept;

/**
 * Description: <br/>
 * Date: 下午2:11:07 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
