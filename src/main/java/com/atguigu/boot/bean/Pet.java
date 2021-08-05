package com.atguigu.boot.bean;

/**
 * 功能描述：
 *
 * @author 陈铉锋
 * @date 2021/8/4
 */
public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
