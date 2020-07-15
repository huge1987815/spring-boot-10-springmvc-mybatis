package com.huge.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Desc:
 * @author:huge
 * @create:2020-07-14 12:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVo implements Serializable {
    private Integer sid;
    private String sname;
    private String sex;
    private Integer age;
    private Sclass sclass;
}
