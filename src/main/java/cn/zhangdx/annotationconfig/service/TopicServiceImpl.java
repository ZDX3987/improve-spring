package cn.zhangdx.annotationconfig.service;

import cn.zhangdx.pojo.BlogUser;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhangdx
 * @date 2025/6/22 22:33
 */
@Slf4j
@Service
@AllArgsConstructor
public class TopicServiceImpl implements TopicService, PraiseContentSupport {

    private String authorName;

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
