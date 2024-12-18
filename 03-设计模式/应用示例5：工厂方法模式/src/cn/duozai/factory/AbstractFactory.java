package cn.duozai.factory;

import cn.duozai.dao.NewsDao;

/**
 * 新闻数据访问层抽象工厂
 */
public interface AbstractFactory {

    /**
     * 生产新闻数据访问层实现类
     *
     * @return 新闻数据访问层实现类
     */
    NewsDao getInstance();

}
