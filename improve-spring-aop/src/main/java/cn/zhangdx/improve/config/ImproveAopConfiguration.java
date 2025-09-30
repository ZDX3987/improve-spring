package cn.zhangdx.improve.config;

import cn.zhangdx.improve.aop.CustomizedAopMethodInterceptor;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ZDX
 * @date 2025/9/29 23:59
 */
@EnableAspectJAutoProxy
@ComponentScan("cn.zhangdx.improve")
@Configuration
public class ImproveAopConfiguration {

//    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        return new DefaultAdvisorAutoProxyCreator();
    }

    @Bean
    public MethodInterceptor methodInterceptor() {
        return new CustomizedAopMethodInterceptor();
    }

    @Bean
    public Advisor advisor(MethodInterceptor methodInterceptor) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* cn.zhangdx.improve.service.*.*(..))");
        DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor(pointcut, methodInterceptor);
        defaultPointcutAdvisor.setOrder(12);
        return defaultPointcutAdvisor;
    }
}
