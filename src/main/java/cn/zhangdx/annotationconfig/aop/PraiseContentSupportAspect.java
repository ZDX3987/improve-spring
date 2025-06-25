package cn.zhangdx.annotationconfig.aop;

import cn.zhangdx.pojo.BlogUser;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 对内容点赞支持处理的切面类
 * @author zhangdx
 * @date 2025/6/22 22:06
 */
@Slf4j
@Component
@Aspect
public class PraiseContentSupportAspect {

    @Pointcut("execution(* cn.zhangdx.annotationconfig.service.PraiseContentSupport.praise(..))")
    public void praiseSupport() {}

    @After("praiseSupport()")
    public void postAfterPraise(JoinPoint joinPoint) {
        String declaringTypeName = joinPoint.getSignature().getDeclaringTypeName();
        Object[] args = joinPoint.getArgs();
        BlogUser blogUser = args.length > 0 ? (BlogUser) args[0] : BlogUser.getDefaultUser();
        log.info("{} 对 {} 点赞操作进行后置处理！", blogUser.getNickname(), declaringTypeName);
    }
}
