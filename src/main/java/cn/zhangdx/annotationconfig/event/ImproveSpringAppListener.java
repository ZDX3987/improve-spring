package cn.zhangdx.annotationconfig.event;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangdx
 * @date 2025/6/6 13:41
 */
@Component
public class ImproveSpringAppListener {

    @EventListener
    public void onAppRefreshed(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        String applicationName = applicationContext.getId();
        Map<String, String> appStatisticsMap = new HashMap<>();
        appStatisticsMap.put("容器名称", applicationName);
        if (applicationContext instanceof AnnotationConfigApplicationContext) {
            AnnotationConfigApplicationContext annotationConfigApplicationContext = (AnnotationConfigApplicationContext) applicationContext;
            ConfigurableListableBeanFactory beanFactory = annotationConfigApplicationContext.getBeanFactory();
            int singletonCount = beanFactory.getSingletonCount();
            appStatisticsMap.put("单例Bean数量", String.valueOf(singletonCount));
            int bfppSize = annotationConfigApplicationContext.getBeanFactoryPostProcessors().size();
            int bppCount = beanFactory.getBeanPostProcessorCount();
            appStatisticsMap.put("BeanFactoryPostProcessor数量", String.valueOf(bfppSize));
            appStatisticsMap.put("BeanPostProcessor数量", String.valueOf(bppCount));
            int listenerSize = annotationConfigApplicationContext.getApplicationListeners().size();
            appStatisticsMap.put("ApplicationListener数量", String.valueOf(listenerSize));

        }
        System.out.println("---------容器刷新完成，打印容器刷新日志---------");
        appStatisticsMap.forEach((k, v) -> System.out.println(k + "：" + v));
        System.out.println("---------打印容器刷新日志结束---------");
    }

    @Async
    @EventListener(condition = "#event.hidden == true")
    public void onImproveSpringAppEvent(ImproveSpringAppEvent event) {
        System.out.println("接收到的ImproveSpring事件消息：" + event.getMessage());
        System.out.println("当前线程是：" + Thread.currentThread().getName());
    }
}
