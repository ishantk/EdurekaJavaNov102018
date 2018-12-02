package co.edureka.xml;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Methods in MyHandler are callback which will be executed automatically for us.
// Stream of Events !!
class MyHandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println("==XML Parsing Started==");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch,start,length);
		System.out.print(data);
	}
	
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("==XML Parsing Finished==");
	}
	
}

// We need not to remember or know tag names !!

public class SAXReader {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/users/ishantkumar/Downloads/myxmldoc.xml");
			FileInputStream inputStream = new FileInputStream(file); // To Read File
			
			MyHandler handler = new MyHandler();
			
			//SAXParserFactory factory = SAXParserFactory.newInstance();
			//SAXParser parser = factory.newSAXParser();
			
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			parser.parse(inputStream, handler);
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}

}
