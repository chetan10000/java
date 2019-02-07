import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Marshall1 {
   public static void main(String[] args) throws IOException {
      FileInputStream fis = null;
      
      try {
         // create new JAXB context
         JAXBContext context = JAXBContext.newInstance(chess.class);
         
         // create new schema out put resolver
         SchemaOutputResolver sor = new DemoSchemaOutputResolver();
         
         // generate schema
         context.generateSchema(sor);
         
         // create new file
         File fi = new File("C:\\Users\\chetan\\eclipse-workspace\\Jaxb1\\new.xml");
         fis = new FileInputStream(fi);
         
         int i=0;
         while((i=fis.read())!=-1)
         {
            char c=(char)i;
            System.out.print(c);
         }
      }catch(Exception ex) {
         
         ex.printStackTrace();
      }finally{
         
         if(fis!=null)
            fis.close();
      }
  
   
}
}

