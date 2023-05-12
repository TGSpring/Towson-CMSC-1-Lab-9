import java.util.*;

public class q2
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    
    
    double tempIn;
    System.out.println("Enter a temperature.");
    tempIn = sc.nextDouble();
    
    
    temperature input = new temperature(tempIn);

    System.out.println(input.getFahrenheit());
    System.out.println(input.getCelsius());
    System.out.println(input.getKelvin());
  }
}