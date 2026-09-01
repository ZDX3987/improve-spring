package cn.zhangdx.mybatis.service;

import cn.zhangdx.mybatis.mapper.BlogAuthorMapper;
import cn.zhangdx.mybatis.mapper.SysUserMapper;
import cn.zhangdx.mybatis.pojo.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZDX
 * @date 2025/7/25 17:57
 */
@Slf4j
@Service
public class BlogAuthorService {

    @Autowired
    private BlogAuthorMapper blogAuthorMapper;

    @Transactional
    public void updateAuthorName(String authorName) {
        blogAuthorMapper.modifyAuthorName(2, authorName);
        throw new RuntimeException("测试嵌套事务中抛出异常");
    }
}
