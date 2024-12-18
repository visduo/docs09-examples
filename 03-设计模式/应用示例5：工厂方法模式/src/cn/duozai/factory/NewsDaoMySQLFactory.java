package cn.duozai.factory;

import cn.duozai.dao.NewsDao;
import cn.duozai.dao.NewsDaoMySQLImpl;

/**
 * 新闻数据访问层MySQL具体工厂
 */
public class NewsDaoMySQLFactory implements AbstractFactory {

    /**
     * 生产新闻数据访问层MySQL实现类
     *
     * @return 新闻数据访问层实现类
     */
    @Override
    public NewsDao getInstance() {
        return new NewsDaoMySQLImpl();
    }

}
