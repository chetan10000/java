import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class Task3 {
	public static void main(String[] args) {
		DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		
	
		
		try {
			docBuilder=factory.newDocumentBuilder();
			Document doc=docBuilder.newDocument();
			
		
			texttoHtml(doc);
			TransformerFactory transformerFactory=TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult consoleresult= new StreamResult(System.out);
			transformer.transform(source,consoleresult);
			
			
			
		   
			
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	
	}
	private static void texttoHtml(Document doc) {
		
		Element root=doc.createElement("Employees");
		doc.appendChild(root);
	
		Element Employee=doc.createElement("Employee");
		root.appendChild(Employee);
		Element name=doc.createElement("name");
		name.setTextContent("john");
		Employee.appendChild(name);
		Element dateOfBirth=doc.createElement("dateOfBirth");
		dateOfBirth.setTextContent("11/11/1992");
		Employee.appendChild(dateOfBirth);
		Element dept=doc.createElement("dept");
		dept.setTextContent("management");
		Employee.appendChild(dept);
		Element position=doc.createElement("position");
		position.setTextContent("senior accoutant");
		Employee.appendChild(position);
		
	
	}

}
