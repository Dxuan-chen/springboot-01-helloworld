package com.atguigu.boot.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 功能描述：
 *
 * @author 陈铉锋
 * @date 2021/8/4
 */
@EqualsAndHashCode
@NoArgsConstructor
@Data
public class User {
    private String name;
    private Integer age;

    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
