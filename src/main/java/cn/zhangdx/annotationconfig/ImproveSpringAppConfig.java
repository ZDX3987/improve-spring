package cn.zhangdx.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhangdx
 * @date 2025/6/4 16:07
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
@ComponentScan({"cn.zhangdx.annotationconfig"})
public class ImproveSpringAppConfig {


    @Bean
    String authorName() {
        return "ZHANGDX6789";
    }

    @Bean
    String otherName() {
        return "hello zdx";
    }

}
