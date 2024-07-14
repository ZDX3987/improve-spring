package cn.zhangdx.service;

import org.springframework.stereotype.Service;

/**
 * @author ZDX
 * @date 2021/9/1 11:06
 */
@Service("lalall")
public class MessageServiceImpl implements MessageService{

    private Message message;

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "消息服务：" + message.getMsg();
    }
}
