package cn.zhangdx.mybatis;

import cn.zhangdx.mybatis.config.MybatisConfig;
import cn.zhangdx.mybatis.mapper.SysUserMapper;
import cn.zhangdx.mybatis.pojo.SysUser;
import cn.zhangdx.mybatis.service.SysUserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class ImproveMybatisSpringApp {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MybatisConfig.class);
//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactoryBean");
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        List<SysUser> userList = sqlSession.selectList("cn.zhangdx.mybatis.mapper.SysUserMapper.findUserNames", "ZH");
        SysUserService sysUserService = applicationContext.getBean(SysUserService.class);
        List<SysUser> userList = sysUserService.getUserList("ZH");
        userList.forEach(user -> System.out.println(user.getId() + ":" + user.getUsername()));
//        sqlSession.close();
    }
}
