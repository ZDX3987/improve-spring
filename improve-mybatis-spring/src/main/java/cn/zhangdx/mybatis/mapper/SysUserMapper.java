package cn.zhangdx.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZDX
 * @date 2025/7/11 15:32
 */
public interface SysUserMapper {

    List<String> findUserNames(@Param("queryName") String queryName);
}
