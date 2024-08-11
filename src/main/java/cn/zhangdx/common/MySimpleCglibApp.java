package cn.zhangdx.common;

import cn.zhangdx.pojo.ChildToy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class MySimpleCglibApp {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ChildToy.class);
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("ChildToy开始执行了");
            methodProxy.invokeSuper(o, objects);
            System.out.println("ChildToy执行完了");
            return null;
        });
        ChildToy childToy = (ChildToy) enhancer.create();
        childToy.setToyName("火车");
        childToy.printMyName();
    }
}
