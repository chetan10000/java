import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class chess {
 
  
  String figure;
  String king;
  String rook;
  String bishop;
  public chess() {}  
  public chess(String figure, String king, String rook,String bishop) {  
      super();  
      this.figure = figure;  
      this.king = king;  
      this.rook = rook;
      this.bishop=bishop;
  }  

   public String getFigure(){
      return figure;
   }

   @XmlElement
   public void setFigure(String figure){
      this.figure = figure;
   }

   public String  getKing(){
      return king;
   }

   @XmlElement
   public void setKing(String king ){
      this.king =king;
   }
   
   public String  getRook(){
	      return rook;
	   }

	   @XmlElement
	   public void setRook(String rook ){
	      this.rook =rook;
	   }
	   
	   public String  getBishop(){
		      return bishop;
		   }

		   @XmlElement
		   public void setBishop(String bishop ){
		      this.bishop =bishop;
		   }

 
}
