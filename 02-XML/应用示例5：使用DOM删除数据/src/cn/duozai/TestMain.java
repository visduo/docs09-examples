package cn.duozai;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;

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
        NodeList nodeList = document.getElementsByTagName("Brand");
        // 遍历手机品牌Brand节点列表
        for (int i = 0; i < nodeList.getLength(); i++) {
            // 获取遍历的手机品牌Brand节点对象
            // 将手机品牌Brand节点对象转换成元素对象
            Element element = (Element) nodeList.item(i);

            // 如果手机品牌Brand元素对象的name属性的值等于苹果，则删除该元素对象
            if ("苹果".equals(element.getAttribute("name"))) {
                // 获取当前元素对象的父节点对象，再从父节点对象中把当前元素对象移除
                element.getParentNode().removeChild(element);
            }
        }

        // 保存XML
        // 创建转换器工厂TransformerFactory
        TransformerFactory tff = TransformerFactory.newInstance();
        // 创建转换器对象Transformer
        Transformer tf = tff.newTransformer();
        // 创建DOMSource对象，将文档对象转换成DOM源对象
        DOMSource domSource = new DOMSource(document);
        // 创建输出流对象
        StreamResult sr = new StreamResult(new FileOutputStream("resources/phone.xml"));
        // 将DOM源对象转换成文件
        tf.transform(domSource, sr);
    }

}
