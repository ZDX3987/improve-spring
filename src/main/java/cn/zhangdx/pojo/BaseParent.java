package cn.zhangdx.pojo;

/**
 * @author ZDX
 * @date 2024/4/7 20:50
 */
public class BaseParent {

    private Integer param = 123;

    public BaseParent() {
        customizedPropertiesPrint(param);
    }

    protected void customizedPropertiesPrint(Integer param) {

    }
}
