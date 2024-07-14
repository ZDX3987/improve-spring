package cn.zhangdx.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZDX
 * @date 2021/9/2 13:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String name;


    public void start() {
        System.out.println(name + "汽车启动了");
    }

    public void stop() {
        System.out.println(name + "汽车停止了");
    }
}
