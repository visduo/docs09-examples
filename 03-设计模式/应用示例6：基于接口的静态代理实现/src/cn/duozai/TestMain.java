package cn.duozai;

/**
 * 测试类
 */
public class TestMain {

    public static void main(String[] args) {
        // 创建对象-张三
        User zhangsan = new User();
        // 张三自己租房
        // zhangsan.rent();

        // 张三让中介帮忙租房
        Agent lisi = new Agent(zhangsan);
        lisi.rent();
    }

}
