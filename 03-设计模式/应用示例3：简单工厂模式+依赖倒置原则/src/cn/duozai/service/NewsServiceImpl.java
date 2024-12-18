package cn.duozai.service;

import cn.duozai.dao.NewsDao;

/**
 * 新闻业务逻辑接口实现类
 */
public class NewsServiceImpl implements NewsService {

    // 依赖倒置原则
    // Service层依赖Dao接口，不依赖工厂或任何实现类
    // 而是依赖某一个具体的接口
    NewsDao newsDao;

    public NewsServiceImpl(NewsDao newsDao) {
        this.newsDao = newsDao;
    }

    /**
     * 新增新闻
     *
     * @return void
     */
    @Override
    public void save() {
        // 调用Dao层方法
        newsDao.save();
    }

}
