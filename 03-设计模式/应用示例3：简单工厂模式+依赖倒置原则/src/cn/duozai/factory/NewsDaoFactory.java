package cn.duozai.factory;

import cn.duozai.dao.NewsDao;
import cn.duozai.dao.NewsDaoSQLServerImpl;

/**
 * 新闻数据访问层工厂
 */
public class NewsDaoFactory {

    /**
     * 生产新闻数据访问层实现类
     *
     * @return 新闻数据访问层实现类
     */
    public static NewsDao getInstance() {
        // 需要哪个实现类，就返回哪个实现类
        return new NewsDaoSQLServerImpl();
    }

}
