
import java.lang.Math; 


public class HelloWorld
{
  
  public static void main(String[] args)
  {
    String welcome="Welcome!";
    char[] chars=welcome.toCharArray();
  	
    try{
    char lastChar=chars[chars.length];
      System.out.println(lastChar); 
    } catch (Exception e) {
      e.printStackTrace();
    }
      
  }
}