package cn.zhangdx.component.beanfactorypostporcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;

/**
 * @author ZDX
 * @date 2024/4/13 18:07
 */
public class Customized33BeanFactoryPostProcessor implements BeanFactoryPostProcessor, PriorityOrdered {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("bean容器启动后置处理器third");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
