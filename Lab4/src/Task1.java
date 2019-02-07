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


public class Task1 {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder=factory.newDocumentBuilder();
			
			Document doc=docBuilder.newDocument();
			Element root=doc.createElement("ComputerEngineering");
			doc.appendChild(root);
		
			Element computer=doc.createElement("Computer");
			root.appendChild(computer);
			Attr attri=doc.createAttribute("Name");
			attri.setValue("Application programming - Java and XML technologies");
			computer.setAttributeNode(attri);
			Attr attribute=doc.createAttribute("Author");
			attribute.setValue("Chetan Parmar");
			computer.setAttributeNode(attribute);
			Element topics=doc.createElement("topics");
			topics.setTextContent("wireless communication");
			computer.appendChild(topics);
			Element topics1=doc.createElement("topics");
			topics1.setTextContent("cyber security");
			computer.appendChild(topics1);
			
			TransformerFactory transformerFactory=TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult consoleresult= new StreamResult(System.out);
			transformer.transform(source,consoleresult);
			
			
			
			 long startTime = System.currentTimeMillis();

		      long total = 0;
		      for (int i = 0; i < 10000000; i++) {
		         total += i;
		      }

		      long stopTime = System.currentTimeMillis();
		      long elapsedTime = stopTime - startTime;
		      System.out.println(elapsedTime);
		   
			
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
