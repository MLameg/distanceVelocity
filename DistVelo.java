import java.util.Scanner;

public class DistVelo
{

   public static void main(String[] args)
   {
      int Time;
      double Distance, Velocity;
      
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter time(in seconds) in free fall:");
      Time = scan.nextInt();
      
      Distance = ( 9.8 * (Time * Time)) / 2;
      
      Velocity = ( 9.8 * Time);
      
      System.out.println( "When in free fall for " + Time + " seconds, an object travels " + Distance + " meters and has the velocity of " + Velocity + " m/sec.");
      
      
      
    }
}