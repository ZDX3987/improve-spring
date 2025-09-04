package cn.zhangdx.mybatis.internal;

import cn.zhangdx.mybatis.pojo.SysUser;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author ZDX
 * @date 2025/8/31 15:37
 */
@Component
public class BlogUserFactoryBean implements FactoryBean<SysUser>, ApplicationContextAware {

    private String applicationContextName;
    private static final Random random = new Random();

    @Override
    public SysUser getObject() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setUsername(applicationContextName + random.nextLong());
        return sysUser;
    }


    @Override
    public Class<SysUser> getObjectType() {
        return SysUser.class;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContextName = applicationContext.getApplicationName();
    }
}
