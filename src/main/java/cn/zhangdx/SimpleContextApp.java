package cn.zhangdx;

import cn.zhangdx.service.Car;
import cn.zhangdx.service.DataImportService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 */
public class SimpleContextApp {
    public static void main(String[] args) throws Exception {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
        System.out.println("Spring Context 启动成功");
        Car car = applicationContext.getBean(Car.class);
        car.start();
        car.stop();

        DataImportService dataImportService = applicationContext.getBean(DataImportService.class);
        dataImportService.doImport(Arrays.asList("张三", "李四", "王五"));

    }
}
