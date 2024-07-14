package cn.zhangdx.component.beanpostporcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ZDX
 * @date 2024/4/13 19:13
 */
public class CustomizedBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomizedBeanPostProcessor before: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomizedBeanPostProcessor after: " + beanName);
        return bean;
    }
}
