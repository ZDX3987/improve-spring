package cn.zhangdx;

import cn.zhangdx.service.Car;
import cn.zhangdx.service.Message;
import cn.zhangdx.service.MessageService;
import cn.zhangdx.service.MessageServiceImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
        System.out.println("Spring Context 启动成功");
        Car car = applicationContext.getBean(Car.class);
        car.start();
        car.stop();

        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(Message.class);
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue("msg", "这是一个消息");
        genericBeanDefinition.setPropertyValues(propertyValues);
        configApplicationContext.registerBeanDefinition("myMessage", genericBeanDefinition);

        AnnotatedGenericBeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(MessageServiceImpl.class);
        MutablePropertyValues propertyValues2 = new MutablePropertyValues();
        propertyValues2.addPropertyValue("message", new RuntimeBeanReference("myMessage"));
        beanDefinition.setPropertyValues(propertyValues2);
        configApplicationContext.registerBeanDefinition("messageService", beanDefinition);



        configApplicationContext.refresh();

        Message message = (Message) configApplicationContext.getBean("myMessage");
        message.printMsg();

        MessageService messageService = (MessageService) configApplicationContext.getBean("messageService");
        System.out.println(messageService.getMessage());

        System.out.println(beanDefinition.getPropertyValues());

    }
}
