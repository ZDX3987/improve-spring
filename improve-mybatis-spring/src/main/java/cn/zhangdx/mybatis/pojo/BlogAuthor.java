package cn.zhangdx.mybatis.pojo;

import cn.zhangdx.mybatis.enumeration.SysUserStatus;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 系统用户实体类
 * @author ZDX
 * @date 2020/06/30 22:20
 */
@Accessors(chain = true)
@Data
public class BlogAuthor {
    private Integer id;
    private String authorId;
    private String sysUserId;
    private String authorName;

}
