package cn.zhangdx.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

import java.util.Arrays;

/**
 * @author ZDX
 * @date 2024/4/13 19:49
 */
public class CustomizedBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
//        registry.removeBeanDefinition("customizedBeanFactoryPostProcessor");
        registry.registerBeanDefinition("customizedBeanFactoryPostProcessor", BeanDefinitionBuilder.genericBeanDefinition(CustomizedBeanFactoryPostProcessor.class).getBeanDefinition());
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
