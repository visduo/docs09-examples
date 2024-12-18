package cn.duozai.factory;

import cn.duozai.dao.NewsDao;
import cn.duozai.dao.NewsDaoSQLServerImpl;

/**
 * 新闻数据访问层SQLServer具体工厂
 *
 * @author 多仔ヾ
 */
public class NewsDaoSQLServerFactory implements AbstractFactory {

    /**
     * 生产新闻数据访问层SQLServer实现类
     *
     * @return 新闻数据访问层实现类
     */
    @Override
    public NewsDao getInstance() {
        return new NewsDaoSQLServerImpl();
    }

}
