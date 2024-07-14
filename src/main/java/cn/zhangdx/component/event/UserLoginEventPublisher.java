package cn.zhangdx.component.event;

import cn.zhangdx.pojo.UserLoginEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author ZDX
 * @date 2024/4/14 10:41
 */
public class UserLoginEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;


    public void login(String username) {
        applicationEventPublisher.publishEvent(new UserLoginEvent(this, username));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
