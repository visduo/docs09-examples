package cn.duozai.service;

import cn.duozai.dao.NewsDao;
import cn.duozai.factory.NewsDaoFactory;

/**
 * 新闻业务逻辑接口实现类
 */
public class NewsServiceImpl implements NewsService {

    /**
     * 新增新闻
     *
     * @return void
     */
    @Override
    public void save() {
        // 通过工厂提供的静态方法对Dao和Service进行解耦工作
        // 调用工厂获得Dao对象
        NewsDao newsDao = NewsDaoFactory.getInstance();

        // 调用Dao层方法
        newsDao.save();
    }

}
