package cn.zhangdx.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.framework.AopContext;

/**
 * @author ZDX
 * @date 2021/9/3 9:48
 */
public class AopService {

    public void customizedBeforeProxy() {
        System.out.println("当前代理的对象是：" + AopContext.currentProxy());
        System.out.println("汽车启动前的检查-----------");
    }

    public void dataImportAroundProxy(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("dataImport before");
        Object proceed = joinPoint.proceed();
        System.out.println("dataImport after");

    }
}
