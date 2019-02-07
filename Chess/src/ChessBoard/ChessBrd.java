package ChessBoard;
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.DefaultHandler;
public class ChessBrd{
	
	public static void main(String[] args){
	try {
		File inputFile=new File("Chess.xml");
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
		boolean name=false;
		boolean position=false;
		String color=null;
		boolean cking=false;
		boolean crook =false;
		boolean cbishop=false;
		
		
		 public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException{
		if (qName.equalsIgnoreCase("figures")) {
		color=attributes.getValue("color");
		
		}
		
			if (qName.equalsIgnoreCase("king")){
				cking=true;
			}
			if (qName.equalsIgnoreCase("rook")){
				crook=true;
			}
			if (qName.equalsIgnoreCase("bishop")){
				cbishop=true;
			}

			
			
		}
		 
		 
		
		public void characters(char ch[],int start,int length) throws SAXException{
			
			if(cking && ("white").equals(color)) {
				System.out.println("white king:"+new String(ch , start,length));
				cking=false;
			}
			if(crook && ("white").equals(color)) {
				System.out.println("white rook:"+new String(ch , start,length));
				crook=false;
			}
			if(cbishop && ("white").equals(color)) {
				System.out.println("white bishop:"+new String(ch , start,length));
				cbishop=false;
			}
			if(cking && ("black").equals(color)) {
				System.out.println("black king:"+new String(ch , start,length));
				cking=false;
			}
			if(crook && ("black").equals(color)) {
				System.out.println(" black rook:"+new String(ch , start,length));
				crook=false;
			}
			if(cbishop && ("black").equals(color)) {
				System.out.println("black bishop:"+new String(ch , start,length));
				cbishop=false;
			}
		}
		
	}
	

	
	
