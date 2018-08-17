//Converting numeric values 

public class HelloWorld
{
  public static void main(String[] args)
  {
    //moving up in memory is fine...
    int intVal=56;
    long longVal=intVal;
    System.out.println(longVal);
    //Moving down requires casting first 
    //because data can be lost this way.
    short shortValue=(short)intVal;
    System.out.println(shortValue);
    
    
    
    
  }
}