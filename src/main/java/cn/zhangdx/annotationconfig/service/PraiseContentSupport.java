package cn.zhangdx.annotationconfig.service;

import cn.zhangdx.pojo.BlogUser;

/**
 * 对内容的点赞支持
 * @author zhangdx
 * @date 2025/6/22 22:12
 */
public interface PraiseContentSupport {

    /**
     * 对内容点赞
     * @param user 操作人
     * @return 操作结果
     */
    boolean praise(BlogUser user);

    /**
     * 对内容取消点赞
     * @param user 操作人
     * @return 操作结果
     */
    boolean unPraise(BlogUser user);
}
