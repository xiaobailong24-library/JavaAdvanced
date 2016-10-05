package me.xiaobailong24.network.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXmlDemo {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder
					.parse(new File(
							"H:/Android/Work/Study/JavaAdvanced/src/me/xiaobailong24/network/xml/languages.xml"));
			// 获取根元素
			Element root = document.getDocumentElement();
			System.out.println("cat=" + root.getAttribute("cat"));
			// 获取子元素
			NodeList list = root.getElementsByTagName("lan");
			for (int i = 0; i < list.getLength(); i++) {
				Element lan = (Element) list.item(i);
				System.out.println("--------------------------");
				System.out.println("id=" + lan.getAttribute("id"));

				// Element name = (Element)
				// lan.getElementsByTagName("name").item(0);
				// Element ide = (Element)
				// lan.getElementsByTagName("ide").item(1);
				// System.out.println("name=" + name.getTextContent());
				// System.out.println("ide=" + ide.getTextContent());

				NodeList child = lan.getChildNodes();
				for (int j = 0; j < child.getLength(); j++) {
					Node c = child.item(j);
					if (c instanceof Element) {
						System.out.println(c.getNodeName() + "="
								+ c.getTextContent());
					}
				}

			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
