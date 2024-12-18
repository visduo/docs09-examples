package cn.duozai;

/**
 * 中介业务实现类
 */
public class Agent implements RentService {

    // 中介Agent帮有钱人User租房
    User target;
    // 要帮哪个对象租房，就传入具体的对象
    public Agent(User target) {
        this.target = target;
    }

    /**
     * 租房
     *
     * @return void
     */
    @Override
    public void rent() {
        // 有钱人租房前后，中介做额外的操作
        System.out.println("中介开始代理租房");

        // 有钱人掏钱租房
        target.rent();

        System.out.println("中介提供后期服务");
    }

}
