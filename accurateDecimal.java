
// How to print decimals accurately
import java.lang.Math; 
import java.math.BigDecimal; //must import BigDecimal

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    double value= .012;
    
    double pSum = value + value + value;
    
    System.out.println("Sum of primatives: "+pSum);
    
    String strValue = Double.toString(value);
    System.out.println("strValue: "+strValue);
    BigDecimal bigValue = new BigDecimal(strValue);
    
    BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
    System.out.println("Sum of BigDecimals: "+bSum.toString());
    
  }
}