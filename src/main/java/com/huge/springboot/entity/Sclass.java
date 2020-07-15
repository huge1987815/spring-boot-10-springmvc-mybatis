package com.huge.springboot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Desc:
 * @author:huge
 * @create:2020-07-14 12:20
 */
@Data
public class Sclass implements Serializable {
    private Integer cid;
    private String cname;
}
