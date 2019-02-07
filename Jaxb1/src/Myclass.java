import java.io.FileOutputStream;  
  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.Marshaller;  
  
  
public class  Myclass {  
public static void main(String[] args) throws Exception{  
    JAXBContext contextObj = JAXBContext.newInstance(chess.class);  
  
    Marshaller marshallerObj = contextObj.createMarshaller();  
    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
  
    chess chess=new chess("red","G1", "D6","E2");  
      
    marshallerObj.marshal(chess, new FileOutputStream("C:\\\\Users\\\\chetan\\\\eclipse-workspace\\\\Jaxb1\\\\new.xml"));  
       
}  
}