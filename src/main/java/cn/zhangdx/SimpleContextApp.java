package cn.zhangdx;

import cn.zhangdx.service.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class SimpleContextApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
        System.out.println("Spring Context 启动成功");
        Car car = applicationContext.getBean(Car.class);
        car.start();
        car.stop();

    }
}
