package cn.zhangdx.pojo;

import org.springframework.context.ApplicationEvent;

/**
 * @author ZDX
 * @date 2024/4/14 10:38
 */
public class UserLoginEvent extends ApplicationEvent {

    private String userName;

    public UserLoginEvent(Object source, String userName) {
        super(source);
        this.userName = userName;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
