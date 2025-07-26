package cn.zhangdx.mybatis.mapper;

import cn.zhangdx.mybatis.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZDX
 * @date 2025/7/11 15:32
 */
public interface SysUserMapper {

    List<SysUser> findUserNames(@Param("queryName") String queryName);
}
