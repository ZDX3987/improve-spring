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
        boolean useSpringType = false;
        List<SysUser> userList;
        if (!useSpringType) {
            // Mybatis原始方式
            SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactoryBean");
            SqlSession sqlSession = sqlSessionFactory.openSession();
            userList = sqlSession.selectList("cn.zhangdx.mybatis.mapper.SysUserMapper.findUserNames", "ZH");
            userList.forEach(user -> System.out.println(user.getId() + ":" + user.getUsername()));
            sqlSession.close();
        } else {
            // Spring Bean方式
            SysUserService sysUserService = applicationContext.getBean(SysUserService.class);
            userList = sysUserService.getUserList("ZH");
            userList.forEach(user -> System.out.println(user.getId() + ":" + user.getUsername()));
//            sysUserService.updateUserName("Hello MyBatis");
        }
    }
}
