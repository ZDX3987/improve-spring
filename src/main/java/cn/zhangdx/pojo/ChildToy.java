package cn.zhangdx.pojo;

import lombok.Data;

/**
 * @author ZDX
 * @date 2024/6/22 16:27
 */
@Data
public class ChildToy {

    private String toyName;

    public ChildToy() {}

    public ChildToy(String toyName) {
        this.toyName = toyName;
    }

    public void printMyName() {
        System.out.println("我的名字是：" + toyName);
    }

    public String toString() {
        return this.toyName;
    }
}
