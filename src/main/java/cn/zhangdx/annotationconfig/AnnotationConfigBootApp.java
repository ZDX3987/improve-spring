package cn.zhangdx.annotationconfig;

import cn.zhangdx.annotationconfig.bean.ArticleMapper;
import cn.zhangdx.annotationconfig.bean.ArticleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 基于注解配置的spring应用启动类
 * @author zhangdx
 * @date 2025/6/4 16:06
 */
public class AnnotationConfigBootApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImproveSpringAppConfig.class);
        ArticleService articleService = applicationContext.getBean(ArticleService.class);
        articleService.createArticle("spring学习（一）");
    }
}
