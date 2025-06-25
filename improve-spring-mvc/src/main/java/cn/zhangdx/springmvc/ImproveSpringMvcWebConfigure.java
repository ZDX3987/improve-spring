package cn.zhangdx.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ZDX
 * @date 2025/6/9 14:56
 */
@Configuration
@EnableWebMvc
@ComponentScan("cn.zhangdx.springmvc.controller")
public class ImproveSpringMvcWebConfigure implements WebMvcConfigurer {

}
