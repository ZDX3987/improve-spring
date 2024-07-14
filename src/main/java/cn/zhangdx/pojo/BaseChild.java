package cn.zhangdx.pojo;

/**
 * @author ZDX
 * @date 2024/4/7 20:52
 */
public class BaseChild extends BaseParent{

    private ChildToy childToy;

    public BaseChild() {
    }

    public BaseChild(ChildToy childToy) {
        this.childToy = childToy;
    }

    @Override
    protected void customizedPropertiesPrint(Integer param) {
        System.out.println("初始化子级调用父级方法：" + param);
    }
}
