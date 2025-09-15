package cn.zhangdx.springmvc;

import cn.zhangdx.springmvc.interceptor.ImproveMvcInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.OptionalValidatorFactoryBean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ImproveMvcInterceptor());
    }


    @Override
    public Validator getValidator() {
        return new LocalValidatorFactoryBean();
    }

}
