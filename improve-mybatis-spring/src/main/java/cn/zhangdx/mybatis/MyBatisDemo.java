package cn.zhangdx.mybatis;

import cn.zhangdx.mybatis.mapper.SysUserMapper;
import cn.zhangdx.mybatis.pojo.SysUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author ZDX
 * @date 2025/12/26 17:00
 */
public class MyBatisDemo {

    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<SysUser> userList = sqlSession.selectList("cn.zhangdx.mybatis.mapper.SysUserMapper.findUserNames", "ZH");
        userList.forEach(user -> System.out.println(user.getId() + ":" + user.getUsername()));
        SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
        sysUserMapper.insertNewUser(new SysUser().setUsername("gfsdf").setNickname("ZH54365456").setPassword("667777"));
        userList = sysUserMapper.findUserNames("ZH");
        userList.forEach(user -> System.out.println(user.getId() + ":" + user.getUsername()));
        sqlSession.close();
    }
}
