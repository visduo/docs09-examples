package cn.duozai;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 测试类
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        // 读取并解析XML
        // 创建解析器工厂DocumentBuilderFactory对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // 创建解析器DocumentBuilder对象
        DocumentBuilder db = dbf.newDocumentBuilder();
        // 解析XML文档
        Document document = db.parse("resources/phone.xml");

        // 获取手机品牌Brand节点列表
        NodeList brandList = document.getElementsByTagName("Brand");

        // 遍历手机品牌Brand节点列表
        for (int i = 0; i < brandList.getLength(); i++) {
            // 获取遍历的手机品牌Brand节点对象
            Node brandNode = brandList.item(i);
            // 将手机品牌Brand节点对象转换成元素对象
            Element brandElement = (Element) brandNode;
            // 获取手机品牌Brand元素对象的name属性的值
            String brandName = brandElement.getAttribute("name");
            // 获取手机品牌Brand元素对象的手机型号type子节点列表
            NodeList typeList = brandElement.getElementsByTagName("type");
            // 遍历手机型号type节点列表
            for (int j = 0; j < typeList.getLength(); j++) {
                // 获取遍历的手机型号type节点对象
                Node typeNode = typeList.item(j);
                // 将手机型号type节点对象转换成元素对象
                Element typeElement = (Element) typeNode;
                // 获取手机型号type元素对象的name属性的值
                String typeName = typeElement.getAttribute("name");
                // 获取手机型号type元素对象的型号价格price子节点列表
                NodeList priceNodeList = typeElement.getElementsByTagName("price");
                // 将第一个型号价格price节点对象转换成元素对象
                Element priceElement = (Element) priceNodeList.item(0);
                // 获取型号价格price元素对象的文本内容
                String price = priceElement.getTextContent();

                // 输出手机品牌名称+手机型号名称+型号价格
                System.out.println(brandName + typeName + "的价格是" + price);
            }
        }
    }

}
