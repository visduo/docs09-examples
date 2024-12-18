package cn.duozai;

/**
 * 有钱人业务实现类
 */
public class User implements RentService {

    /**
     * 租房
     *
     * @return void
     */
    @Override
    public void rent() {
        System.out.println("有钱人掏钱租房");
    }

}
