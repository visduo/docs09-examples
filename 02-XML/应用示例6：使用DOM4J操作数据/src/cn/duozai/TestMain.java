package cn.duozai;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 测试类
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        // 创建SAXReader对象读取XML
        SAXReader reader = new SAXReader();
        Document document = reader.read("resources/phone.xml");

        // 获取根元素对象
        Element rootElement = document.getRootElement();

        // 获取手机品牌Brand子元素列表
        List<Element> brandList = rootElement.elements("Brand");
        // 遍历手机品牌Brand子元素列表
        for (Element brandElement : brandList) {
            // 获取手机品牌Brand元素对象的name属性的值
            String brandName = brandElement.attributeValue("name");
            // 获取手机品牌Brand元素对象的手机型号type子元素列表
            List<Element> typeList = brandElement.elements("type");
            // 手机型号type元素列表
            for (Element typeElement : typeList) {
                // 获取手机型号type元素对象的name属性的值
                String typeName = typeElement.attributeValue("name");
                // 获取手机型号type元素对象的型号价格price子元素对象
                Element priceElement = typeElement.element("price");
                // 获取型号价格price元素对象的文本内容
                String price = priceElement.getText();

                // 输出品牌名称+手机类型+价格
                // 输出手机品牌名称+手机型号名称+型号价格
                System.out.println(brandName + typeName + "的价格是" + price);
            }
        }
    }

}
