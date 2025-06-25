package cn.zhangdx.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 博客用户实体
 * @author zhangdx
 * @date 2025/6/22 22:15
 */
@Data
@Accessors(chain = true)
public class BlogUser {

    private String nickname;

    private String userId;

    private String username;

    public static BlogUser getDefaultUser() {
        BlogUser blogUser = new BlogUser();
        blogUser.setUserId("1");
        blogUser.setNickname("默认用户");
        return blogUser;
    }
}
