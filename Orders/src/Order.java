



import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.DefaultHandler;
public class Order{
	
	public static void main(String[] args){
	try {
		File inputFile=new File("Orders.xml");
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser saxParser=factory.newSAXParser();
		UserHandler userhandler= new UserHandler();
		saxParser.parse(inputFile, userhandler);
		
	}catch(Exception E) {
		E.printStackTrace();
	}

	}
}

	class UserHandler extends DefaultHandler{
		boolean order=false;
		boolean count=false;
		boolean id=false;
		 public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException{
			
			 System.out.println("Start Element:"+ qName);

		      if (qName.equalsIgnoreCase("order")) {
		         String orderId = attributes.getValue("id");
		         System.out.println("Id : " + orderId);
		      }
			if(qName.equalsIgnoreCase("order")) {
				order=true;
				
			}
			if(qName.equalsIgnoreCase("count")) {
				order=true;
				
			}
			if(qName.equalsIgnoreCase("id")) {
				id=true;
				
			}
			 
			}
		 public void endElement(String uri,String localName,String qName) {
			 System.out.println("End Element:"+ qName);
			 if(qName.equalsIgnoreCase("order")) {
				 System.out.println("++++++++++++++++++++++");
			 }
		 }
		 
		public void characters(char ch[],int start,int length) throws SAXException{
			if(order) {
				System.out.println(new String(ch,start ,length));
			}
			if(id) {
				System.out.println(new String(ch,start ,length));
			}
			
			if(count) {
				System.out.println(new String(ch,start ,length));
			}
			
		}
		
	}
