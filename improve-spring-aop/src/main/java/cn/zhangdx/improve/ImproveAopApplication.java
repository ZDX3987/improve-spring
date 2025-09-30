package cn.zhangdx.improve;

import cn.zhangdx.improve.config.ImproveAopConfiguration;
import cn.zhangdx.improve.service.ArticleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ZDX
 * @date 2025/9/29 23:58
 */
public class ImproveAopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImproveAopConfiguration.class);
        ArticleService articleService = applicationContext.getBean(ArticleService.class);
        articleService.printArticleName("Spring中的FactoryBean是什么？");
    }
}
