package cn.zhangdx.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author ZDX
 * @date 2024/6/8 20:06
 */
public class CustomizedBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition customizedBeanPost = beanFactory.getBeanDefinition("customizedBeanPost");
        System.out.println(customizedBeanPost);
    }
}
