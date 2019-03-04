package _xml;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * xml dom4j解析 使用
 * @author Nancy
 *
 */
public class TestXml {
  public static void main(String[] args) throws Exception {
		SAXReader sr = new SAXReader();
		Document document = sr.read(new File("src/Score.xml"));
		Element root = document.getRootElement();   // 获取根元素
		System.out.println(root.getName());
		
		
		Iterator<?> it = root.elementIterator();   // 获取子元素
		while(it.hasNext()) {
			Element e = (Element)it.next();
			Attribute a = e.attribute("id");
			System.out.println(a.getName() + ": "+ a.getValue());
			System.out.println(e.getName());
			Element name = e.element("name");
			Element score = e.element("score");
			System.out.println(name.getName() +":" +name.getStringValue());
			System.out.println(score.getName() + ":" +score.getStringValue());
			System.out.println("----------------------");
		}
		
		
	}
}
