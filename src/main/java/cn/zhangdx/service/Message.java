package cn.zhangdx.service;

import lombok.Data;
import lombok.Setter;

/**
 * @author ZDX
 * @date 2021/9/1 17:24
 */
@Data
public class Message {

    private String msg;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    private MessageService messageService;

    public String send() {
        return messageService.getMessage();
    }

    public void printMsg() {
        System.out.println("内容为：" + this.msg);
    }
}
