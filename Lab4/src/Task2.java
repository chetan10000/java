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

public class Task2 {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder=factory.newDocumentBuilder();
			
			Document doc=docBuilder.parse(new File("book.xml"));
			doc.getDocumentElement().normalize();
			Element root=doc.getDocumentElement();
			System.out.println(root.getNodeName());
			NodeList bookList=doc.getElementsByTagName("book");
			System.out.println("******************************************************************");
			for(int temp=0;temp<bookList.getLength();temp++) {
				Node node=bookList.item((temp));
		
				if(node.getNodeType()==Node.ELEMENT_NODE) {
					Element element=(Element)node;
					System.out.println("id:"+element.getAttribute("id"));
					System.out.println("author:"+ element.getElementsByTagName("author").item(0).getTextContent());
					System.out.println("titles is:"+ element.getElementsByTagName("title").item(0).getTextContent());
					System.out.println("genre is :"+ element.getElementsByTagName("genre").item(0).getTextContent());

					System.out.println("price:"+ element.getElementsByTagName("price").item(0).getTextContent());
					System.out.println("publish Date:"+ element.getElementsByTagName("publish_date").item(0).getTextContent());
					System.out.println("description:"+ element.getElementsByTagName("description").item(0).getTextContent());
					System.out.println("********************************************************************");
				}
			}
			
		
		   
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
