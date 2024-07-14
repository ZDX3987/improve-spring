package cn.zhangdx;

import cn.zhangdx.component.event.UserLoginEventPublisher;
import cn.zhangdx.pojo.BaseChild;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZDX
 * @date 2024/4/7 20:18
 */
public class SpringMainApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        applicationContext.getBeanFactory().ignoreDependencyInterface(BaseChild.class);
        UserLoginEventPublisher userLoginEventPublisher = (UserLoginEventPublisher) applicationContext.getBean("userLoginEventPublisher");
        userLoginEventPublisher.login("zhangdx");
    }
}
