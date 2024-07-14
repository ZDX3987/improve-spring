package cn.zhangdx.component.beanfactorypostporcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * @author ZDX
 * @date 2024/4/13 18:07
 */
public class Customized22BeanFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("bean容器启动后置处理器second");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
