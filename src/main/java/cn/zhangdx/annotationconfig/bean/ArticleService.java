package cn.zhangdx.annotationconfig.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhangdx
 * @date 2025/6/4 16:09
 */
@Component
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public void createArticle(String articleName) {
        System.out.println("ArticleService 创建文章开始");
        articleMapper.saveArticle(articleName);
        System.out.println("ArticleService 创建文章结束");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean ArticleService 完成了PropertiesSet操作");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Bean ArticleService 销毁了");
    }
}
