package cn.zhangdx.mybatis;

import cn.zhangdx.mybatis.config.MybatisConfig;
import cn.zhangdx.mybatis.mapper.SysUserMapper;
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
        SqlSessionFactory sqlSessionFactory = applicationContext.getBean(SqlSessionFactory.class);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<String> usernames = sqlSession.selectList("cn.zhangdx.mybatis.mapper.SysUserMapper.findUserNames", "ZH");
        usernames.forEach(System.out::println);
    }
}
