package cn.zhangdx.component.event;

import cn.zhangdx.pojo.UserLoginEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author ZDX
 * @date 2024/4/14 10:43
 */
public class UserLoginListener implements ApplicationListener<UserLoginEvent> {


    @Override
    public void onApplicationEvent(UserLoginEvent event) {
        System.out.println("监听到 " + event.getUserName() + "登录了");
    }
}
