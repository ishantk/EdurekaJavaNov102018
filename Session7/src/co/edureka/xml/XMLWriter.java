package co.edureka.xml;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Employee{
	int eid;
	String name;
	int salary;
}

public class XMLWriter {

	public static void main(String[] args) {
		
		
		try {
			
			// Object : which is creates in heap area of ram.
			// It is temporary !!
			Employee emp = new Employee();
			emp.eid = 101;
			emp.name = "John";
			emp.salary = 50000;
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			
			Element elmRoot = document.createElement("employees");
			Element elmEmployee = document.createElement("employee");
			Element elmEid = document.createElement("eid");
			Element elmName = document.createElement("name");
			Element elmSalary = document.createElement("salary");
			
			Text txtEid = document.createTextNode(String.valueOf(emp.eid));
			Text txtName = document.createTextNode(emp.name);
			Text txtSalary = document.createTextNode(String.valueOf(emp.salary));
			
			/*
			 	<employees>
			 		<employee>
			 			<eid>101</eid>
			 			<name>John</name>
			 			<salary>50000</salary>
			 		</employee>
			 	</employees>		
			 */
			
			elmEid.appendChild(txtEid);
			elmName.appendChild(txtName);
			elmSalary.appendChild(txtSalary);
			
			elmEmployee.appendChild(elmEid);
			elmEmployee.appendChild(elmName);
			elmEmployee.appendChild(elmSalary);
			
			elmRoot.appendChild(elmEmployee);
			
			document.appendChild(elmRoot);
			
			// Write document into a file
			File file = new File("/users/ishantkumar/Downloads/myxmldoc.xml");
			FileOutputStream outputStream = new FileOutputStream(file);
			StreamResult result = new StreamResult(outputStream);
			
			DOMSource source = new DOMSource(document);
			
			Transformer transformer  = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
			
			System.out.println("==XML Written==");
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	

	}

}
