package cn.zhangdx.mybatis.service;

import cn.zhangdx.mybatis.mapper.SysUserMapper;
import cn.zhangdx.mybatis.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZDX
 * @date 2025/7/25 17:57
 */
@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUser> getUserList(String queryName) {
        return sysUserMapper.findUserNames(queryName);
    }
}
