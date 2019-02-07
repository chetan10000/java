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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;


public class Task2_1 {
	public static void main(String[] args) {
		String file="book.xml";
		File xmlFile=new File(file);
		DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		try {
			docBuilder=factory.newDocumentBuilder();
			Document doc=docBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			addNode(doc);
			changeNode(doc);
			removeNode(doc);
			
			Element root=doc.getDocumentElement();
			System.out.println(root.getNodeName());
			NodeList bookList=doc.getElementsByTagName("book");
		
			System.out.println("******************************************************************");
		
			
	
			
		   
			doc.getDocumentElement().normalize();
			TransformerFactory transformfactory=TransformerFactory.newInstance();
			Transformer transformer=transformfactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult result=new StreamResult(System.out);
			transformer.transform(source, result);
			StreamResult resultFile=new StreamResult(new File("C:\\Users\\chetan\\eclipse-workspace\\lab4\\update.xml"));
			transformer.transform(source, resultFile);
			System.out.println("\n *****************************************************************");
			
			
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void removeNode(Document doc) {
		
		NodeList books=doc.getElementsByTagName("book");
		Element book=null;
		for(int i=0;i<books.getLength();i++) {
			book =(Element) books.item(i);
			Node Author =book.getElementsByTagName("author").item(0);
			book.removeChild(Author);
		
			
			
		}
		
		
	}
private static void changeNode(Document doc) {
		
		Node books=doc.getElementsByTagName("book").item(0);
		NamedNodeMap attr=books.getAttributes();
		Node id=attr.getNamedItem("id");
		id.setTextContent("bk115");
			
			
		}
		
		
	
private static void addNode(Document doc) {
	
	NodeList books=doc.getElementsByTagName("book");
	Element book=null;
	for(int i=0;i<books.getLength();i++) {
		book =(Element) books.item(i);
		Element status=doc.createElement("status");
		status.setTextContent("available");
		book.appendChild(status);
		
	
		
		
	}
	
}

	
}
