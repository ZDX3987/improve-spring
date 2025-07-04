package cn.zhangdx.annotationconfig;

import cn.zhangdx.annotationconfig.bean.ArticleService;
import cn.zhangdx.annotationconfig.event.ImproveSpringAppEvent;
import cn.zhangdx.annotationconfig.event.ImproveSpringAppEventPublisher;
import cn.zhangdx.annotationconfig.service.PraiseContentSupport;
import cn.zhangdx.annotationconfig.service.TopicServiceImpl;
import cn.zhangdx.pojo.BlogUser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 基于注解配置的spring应用启动类
 * @author zhangdx
 * @date 2025/6/4 16:06
 */
public class AnnotationConfigBootApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImproveSpringAppConfig.class);
//        ArticleService articleService = applicationContext.getBean(ArticleService.class);
//        articleService.createArticle("spring学习（一）");
//        ImproveSpringAppEventPublisher improveSpringAppEventPublisher = applicationContext.getBean(ImproveSpringAppEventPublisher.class);
//        improveSpringAppEventPublisher.publishImproveSpringAppEvent(new ImproveSpringAppEvent("开始吧improveSpring事件发布", true));

        TopicServiceImpl topicService = applicationContext.getBean("topicServiceImpl", TopicServiceImpl.class);
        // TopicServiceImpl topicService = applicationContext.getBean("topicServiceImpl", TopicServiceImpl.class);
        topicService.praise(new BlogUser().setUserId("325476587697").setNickname("default"));
    }
}
