package cn.duozai.dao;

/**
 * 新闻数据访问接口SQLServer实现类
 */
public class NewsDaoSQLServerImpl implements NewsDao {

    /**
     * 新增新闻
     *
     * @return void
     */
    @Override
    public void save() {
        System.out.println("在SQLServer中添加新闻");
    }

}
