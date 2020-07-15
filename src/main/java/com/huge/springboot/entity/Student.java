package com.huge.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Desc:
 * @author:huge
 * @create:2020-07-14 12:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private Integer sid;
    private String sname;
    private String sex;
    private Integer age;
    private Integer cid;
}
