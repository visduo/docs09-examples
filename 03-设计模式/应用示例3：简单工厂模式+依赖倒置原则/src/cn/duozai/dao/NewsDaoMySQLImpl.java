package cn.duozai.dao;

/**
 * 新闻数据访问接口MySQL实现类
 */
public class NewsDaoMySQLImpl implements NewsDao {

    /**
     * 新增新闻
     *
     * @return void
     */
    @Override
    public void save() {
        System.out.println("在MySQL中添加新闻");
    }

}
