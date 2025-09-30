package cn.zhangdx.improve.aop;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author ZDX
 * @date 2025/9/30 0:11
 */
@Slf4j
public class CustomizedAopMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String methodName = invocation.getMethod().getName();
        log.info("执行方法{}自定义切面Before", methodName);
        Object result = invocation.proceed();
        log.info("执行方法{}自定义切面After", methodName);
        return result;
    }
}
