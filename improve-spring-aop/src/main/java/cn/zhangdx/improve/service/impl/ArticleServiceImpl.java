package cn.zhangdx.improve.service.impl;

import cn.zhangdx.improve.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @author ZDX
 * @date 2025/9/30 0:16
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public void printArticleName(String articleName) {
        System.out.println("打印文章名称：" + articleName);
    }

    @Override
    public String getArticleText() {
        return "这是一篇文章测试内容";
    }
}
