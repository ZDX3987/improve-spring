package cn.zhangdx.annotationconfig.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author ZDX
 * @date 2025/6/6 21:11
 */
@Component
public class ImproveSpringAppEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }


    public void publishImproveSpringAppEvent(ImproveSpringAppEvent event) {
        applicationEventPublisher.publishEvent(event);
    }
}
