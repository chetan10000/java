



import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.DefaultHandler;
public class Employee{
	
	public static void main(String[] args){
	try {
		File inputFile=new File("staff.xml");
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser saxParser=factory.newSAXParser();
		UserHandler1 userhandler= new UserHandler1();
		saxParser.parse(inputFile, userhandler);
		
	}catch(Exception E) {
		E.printStackTrace();
	}

	}
}

	class UserHandler1 extends DefaultHandler{
		boolean surname=false;
		boolean name=false;
		boolean id=false;
		boolean city=false;
		boolean mobile=false;
		boolean email=false;
		boolean company=false;
		String Id=null;
		String Name=null;
		
		 public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException{
			
			 System.out.println("Start Element:"+ qName);
			 if(qName.equalsIgnoreCase("companyname")) {
				 company=true;
				 
			 }
			 
		     
			
			 
			 
	}
	
		 public void endElement(String uri,String localName,String qName) {
			 System.out.println("End Element:"+ qName);
			
		 }
		 
		public void characters(char ch[],int start,int length) throws SAXException{
		
		if(company) {
			System.out.println(new String(ch,start,length));
			
		}
	}
	}