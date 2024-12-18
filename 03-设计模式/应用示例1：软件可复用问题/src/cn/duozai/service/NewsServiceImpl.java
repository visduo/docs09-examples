package cn.duozai.service;

import cn.duozai.dao.NewsDao;
import cn.duozai.dao.NewsDaoMySQLImpl;

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
        // Service层依赖Dao层
        // Service层对Dao层强依赖，Dao层需要变更，Service层对应的位置也要变更
        NewsDao newsDao = new NewsDaoMySQLImpl();

        // 调用Dao层方法
        newsDao.save();
    }

}
