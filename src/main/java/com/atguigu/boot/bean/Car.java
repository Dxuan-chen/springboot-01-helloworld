package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @author 陈铉锋
 * @date 2021/8/5
 */
/**
* //@Component把组件添加到容器中，只有容器中的组件才会拥有SpringBoot提供的强大功能
*/
//@Component
@ConfigurationProperties(prefix = "mycar")
@NoArgsConstructor  //无参构造器
@AllArgsConstructor //全参构造器
@ToString
@Data
public class Car {
    private String brand;
    private Integer price;

}
