package cn.zhangdx.pojo;

import lombok.Data;

/**
 * @author ZDX
 * @date 2024/6/22 16:27
 */
@Data
public class ChildToy {

    private String toyName;

    public ChildToy(String toyName) {
        this.toyName = toyName;
    }

    public String toString() {
        return this.toyName;
    }
}
