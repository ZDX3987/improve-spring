package cn.zhangdx.improve.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ZDX
 * @date 2025/9/30 16:30
 */
@Slf4j
@Order(10)
@Component
@Aspect
public class ProcessTimeAspect {

    @Pointcut("execution(* cn.zhangdx.improve.service.*.*(..))")
    public void processPointcut() {}

    @Around(value = "processPointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("方法执行计时器，开始执行方法");
        long startMillis = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long spendMillis = System.currentTimeMillis() - startMillis;
        log.info("方法执行计时器，methodName: {}, spend: {}", joinPoint.getSignature().getName(), spendMillis);
        return result;
    }
}
