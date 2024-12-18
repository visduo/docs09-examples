package cn.duozai;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
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

        // 创建手机品牌Brand元素对象
        Element brandElement = document.createElement("Brand");
        // 设置手机品牌Brand元素对象的name属性
        brandElement.setAttribute("name", "小米");

        // 创建手机型号type元素对象
        Element mi15Element = document.createElement("type");
        // 设置手机型号type元素对象的name属性
        mi15Element.setAttribute("name", "Mi 15");

        // 创建型号价格price元素对象
        Element priceElement = document.createElement("price");
        // 设置型号价格price元素对象的文本内容
        priceElement.setTextContent("4999");

        // 将型号价格price元素对象追加到手机型号type元素对象中
        mi15Element.appendChild(priceElement);

        // 将手机型号type元素对象追加到手机品牌Brand元素对象
        brandElement.appendChild(mi15Element);

        // 将手机品牌Brand元素对象追加到根节点PhoneInfo中
        NodeList phoneInfoList = document.getElementsByTagName("PhoneInfo");
        Node phoneInfo = phoneInfoList.item(0);
        phoneInfo.appendChild(brandElement);

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
