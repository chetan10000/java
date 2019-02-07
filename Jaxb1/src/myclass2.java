import java.io.File;  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;  
  
public class myclass2 {  
public static void main(String[] args) {  
     try {    
            File file = new File("C:\\\\\\\\Users\\\\\\\\chetan\\\\\\\\eclipse-workspace\\\\\\\\Jaxb1\\\\\\\\newu.xml");    
            JAXBContext jaxbContext = JAXBContext.newInstance(chess.class);    
         
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();    
            chess e=(chess) jaxbUnmarshaller.unmarshal(file);    
            System.out.println("figure:"+e.getFigure()+" "+"\nking:"+e.getKing()+" "+"\nrook:"+e.getRook()+"\nbishop:"+e.getBishop());  
              
          } catch (JAXBException e) {e.printStackTrace(); }    
         
}  
}
