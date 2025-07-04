package cn.zhangdx.annotationconfig.bean;

/**
 * @author zhangdx
 * @date 2025/6/5 15:58
 */

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {

//    @Autowired
    private String authorName;
    @Autowired
    private ArticleService articleService;

    public void saveArticle(String articleName) {
        System.out.println("作者：" + authorName + "，ArticleMapper 保存文章 :" + articleName);
    }
}
