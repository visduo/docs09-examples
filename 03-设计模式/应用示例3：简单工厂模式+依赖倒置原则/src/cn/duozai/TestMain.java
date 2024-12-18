package cn.duozai;

import cn.duozai.dao.NewsDao;
import cn.duozai.factory.NewsDaoFactory;
import cn.duozai.service.NewsService;
import cn.duozai.service.NewsServiceImpl;

/**
 * 测试类
 */
public class TestMain {

    public static void main(String[] args) {
        // 通过工厂获取新闻Dao实现类
        NewsDao newsDao = NewsDaoFactory.getInstance();

        // 在创建新闻Service层时，将Dao实现类传入
        NewsService newsService = new NewsServiceImpl(newsDao);
        newsService.save();
    }

}
