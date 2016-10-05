package me.xiaobailong24.network.xml;

import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Dom4J {

	public static void main(String[] args) {
		String xmlString = "<root><people>KOBE</people></root>";

		try {
			Document document = DocumentHelper.parseText(xmlString);
			// String×ª»¯Îª×Ö·û´®
			System.out.println(document.asXML());

			// TODO

		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creating a new XML document
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	public static Document createDocument() {
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("root");

		Element author1 = root.addElement("author")
				.addAttribute("name", "Kobe").addAttribute("Location", "USA")
				.addText("Kobe Bryant");

		Element author2 = root.addElement("author")
				.addAttribute("name", "James").addAttribute("Location", "USA")
				.addText("Lebron James");

		return document;
	}

	/**
	 * Writing a document to a file
	 * 
	 * @param document
	 * @throws IOException
	 */
	public static void writeDocument(Document document) throws IOException {

		// lets write to a file
		XMLWriter writer = new XMLWriter(new FileWriter("output.xml"));
		writer.write(document);
		writer.close();

		// Pretty print the document to System.out
		OutputFormat format = OutputFormat.createPrettyPrint();
		writer = new XMLWriter(System.out, format);
		writer.write(document);

		// Compact format to System.out
		format = OutputFormat.createCompactFormat();
		writer = new XMLWriter(System.out, format);
		writer.write(document);

	}

	/**
	 * Converting to Strings
	 * 
	 * @param document
	 * @return
	 */
	public static String xmlToString(Document document) {
		return document.asXML();
	}

	/**
	 * Converting from Strings
	 * 
	 * @param string
	 * @return
	 * @throws DocumentException
	 */
	public static Document stringToXml(String string) throws DocumentException {
		// String text = "<person> <name>James</name> </person>";
		Document document = DocumentHelper.parseText(string);
		return document;
	}
}
