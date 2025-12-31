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
public class SysUser {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String tel;
    private String email;
    private String avatar;
    private String introduce;
    private LocalDateTime createTime;
    private SysUserStatus status;
    private LocalDateTime updatedAt;
}
