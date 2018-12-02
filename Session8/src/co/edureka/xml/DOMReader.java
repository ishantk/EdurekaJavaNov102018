package co.edureka.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMReader {

	// Client -> Server -> Share an XML Response | SOAP (Simple Object Access Protocol)
	
	public static void main(String[] args) {
	
		try {
			
			File file = new File("/users/ishantkumar/Downloads/myxmldoc.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // Reading from XML File
			
			System.out.println("Root Node is: "+document.getDocumentElement().getNodeName());
			
			NodeList nodeList = document.getElementsByTagName("employee");
			System.out.println(nodeList.getLength()+" employee elements found !!");
			
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i);
				Element element = (Element)node; // Downcasting
				System.out.println("EID: "+element.getElementsByTagName("eid").item(0).getTextContent());
				System.out.println("NAME: "+element.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("SALARY: "+element.getElementsByTagName("salary").item(0).getTextContent());
				System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}

	}

}
