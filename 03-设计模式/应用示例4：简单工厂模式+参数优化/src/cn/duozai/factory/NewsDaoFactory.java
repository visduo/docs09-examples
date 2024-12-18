package cn.duozai.factory;

import cn.duozai.dao.NewsDao;
import cn.duozai.dao.NewsDaoMySQLImpl;
import cn.duozai.dao.NewsDaoSQLServerImpl;

/**
 * 新闻数据访问层工厂
 */
public class NewsDaoFactory {

    /**
     * 生产新闻数据访问层实现类
     *
     * @param type 数据库类型
     * @return 新闻数据访问层实现类
     */
    public static NewsDao getInstance(String type) throws Exception {
        // 根据数据库类型返回对应的实现类
        if(type.equals("MySQL")) {
            return new NewsDaoMySQLImpl();
        } else if(type.equals("SQLServer")) {
            return new NewsDaoSQLServerImpl();
        } else {
            throw new Exception("未知的数据库类型");
        }
    }

}
