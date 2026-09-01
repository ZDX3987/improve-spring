package cn.zhangdx.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author ZDX
 * @date 2025/7/11 15:32
 */
public interface BlogAuthorMapper {

    void modifyAuthorName(@Param("id") Integer id, @Param("authorName") String authorName);
}
