package cn.duozai;

/**
 * 中介业务实现类
 */
public class Agent extends User {

    /**
     * 租房（重写父类方法）
     *
     * @return void
     */
    @Override
    public void rent() {
        // 有钱人租房前后，中介做额外的操作
        System.out.println("中介开始代理租房");

        // 有钱人掏钱租房
        // 调用父类的租房方法
        super.rent();

        System.out.println("中介提供后期服务");
    }

}
