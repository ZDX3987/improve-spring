package cn.zhangdx.improve;

import cn.zhangdx.improve.dependinjection.DemoController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author zhangdx
 * @date 2026/8/31 11:42
 */
public class ImproveSpringCommonApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("cn.zhangdx.improve");
        DemoController demoController = applicationContext.getBean(DemoController.class);
        demoController.testDependInjection();
    }
}
