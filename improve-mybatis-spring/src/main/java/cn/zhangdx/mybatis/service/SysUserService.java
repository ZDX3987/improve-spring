package cn.zhangdx.mybatis.service;

import cn.zhangdx.mybatis.mapper.SysUserMapper;
import cn.zhangdx.mybatis.pojo.SysUser;
import lombok.extern.slf4j.Slf4j;
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
public class SysUserService {

    private SysUserMapper sysUserMapper;
    @Resource
    private SysUser sysUser;

    public SysUserService(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    public List<SysUser> getUserList(String queryName) {
        System.out.println(sysUser.getUsername());
        List<SysUser> userNames = sysUserMapper.findUserNames(queryName);
        return userNames;
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateUserName(String newName) {
        log.info("updateUserName, newName-{}", newName);
        sysUserMapper.updateNickname(newName);
    }
}
