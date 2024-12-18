package cn.duozai;

import cn.duozai.service.NewsService;
import cn.duozai.service.NewsServiceImpl;

/**
 * 测试类
 */
public class TestMain {

    public static void main(String[] args) {
        // 调用Service层添加新闻
        NewsService newsService = new NewsServiceImpl();
        newsService.save();
    }

}
