/**
 * Project Name:microservicecloud-api
 * File Name:Dept.java
 * Package Name:com.bohua.springcloud.entities
 * Date:下午12:46:17
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package com.bohua.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Description: <br/>
 * Date: 下午12:46:17 <br/>
 * 
 * @author iscream
 * @version
 * @see
 */
@AllArgsConstructor
@NoArgsConstructor
@Data // 为每个方法生成set get
@Accessors(chain = true) // 链式访问风格
public class Dept implements Serializable { // engity orm mysql->Dept(table)
    private Long deptno; // 主键

    private String dname; // 部门名称

    private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

}
