package cn.zhangdx.annotationconfig;

import cn.zhangdx.annotationconfig.bean.ArticleMapper;
import cn.zhangdx.annotationconfig.bean.ImproveSpringAppListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangdx
 * @date 2025/6/4 16:07
 */
@Configuration
@ComponentScan
public class ImproveSpringAppConfig {

//    @Bean
//    ArticleMapper articleMapper() {
//        return new ArticleMapper("ZHANGDX");
//    }

    @Bean
    String authorName() {
        return "ZHANGDX";
    }

}
