package cn.zhangdx.mybatis.enumeration;

import cn.zhangdx.mybatis.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ZDX
 * @date 2025/9/12 22:06
 */
@Getter
@AllArgsConstructor
public enum SysUserStatus {

    DISABLE(0, "关闭"),
    ENABLE(1, "开启")
    ;

    @EnumValue
    private final int status;
    private final String name;
}
