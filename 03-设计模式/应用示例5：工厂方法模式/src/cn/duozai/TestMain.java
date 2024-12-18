package cn.duozai;

import cn.duozai.dao.NewsDao;
import cn.duozai.factory.AbstractFactory;
import cn.duozai.factory.NewsDaoMySQLFactory;
import cn.duozai.service.NewsService;
import cn.duozai.service.NewsServiceImpl;

/**
 * 测试类
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        // 创建具体工厂
        AbstractFactory newsDaoMySQLFactory = new NewsDaoMySQLFactory();

        // 创建新闻DAO层接口实现类
        NewsDao newsDao = newsDaoMySQLFactory.getInstance();

        // 在创建新闻Service层时，将Dao实现类传入
        NewsService newsService = new NewsServiceImpl(newsDao);
        newsService.save();
    }

}
