package cn.zhangdx.annotationconfig.service;

import cn.zhangdx.pojo.BlogUser;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

/**
 * @author zhangdx
 * @date 2025/6/22 22:33
 */
@Slf4j
@Service
@Getter
public class TopicServiceImpl implements TopicService, PraiseContentSupport {

    private String authorName;
    private String otherName;

    @Autowired
    public void setName(String authorName, String otherName) {
        this.authorName = authorName;
        this.otherName = otherName;
        System.out.println("TopicServiceImpl setName authorName: " + authorName + ", otherName: "+ otherName);
    }



    /**
     * 对内容点赞
     *
     * @param user 操作人
     * @return 操作结果
     */
    @Override
    public boolean praise(BlogUser user) {
        log.info("{} 对主题点赞成功, authorName={}", user.getNickname(), authorName);
        return true;
    }

    /**
     * 对内容取消点赞
     *
     * @param user 操作人
     * @return 操作结果
     */
    @Override
    public boolean unPraise(BlogUser user) {
        return false;
    }

}
