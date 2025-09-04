package cn.zhangdx.mybatis.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ZDX
 * @date 2025/7/11 14:18
 */
@MapperScan(basePackages = "cn.zhangdx.mybatis.mapper")
@Configuration
@ComponentScan("cn.zhangdx.mybatis")
public class MybatisConfig {

    @Autowired
    private ResourcePatternResolver resourceLoader;

    @Bean
    public DataSource dataSource() {
        Resource resource = resourceLoader.getResource("classpath:jdbc.properties");
        try {
            Properties properties = new Properties();
            properties.load(resource.getInputStream());
            return new HikariDataSource(new HikariConfig(properties));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
//        sqlSessionFactoryBean.setConfigLocation(resourceLoader.getResource("classpath:mybatis-config.xml"));
        try {
            sqlSessionFactoryBean.setMapperLocations(resourceLoader.getResources("classpath:mapper/*.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sqlSessionFactoryBean;
    }
}
