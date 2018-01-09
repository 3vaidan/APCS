import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner
{

 /**
  * Create a Magpie, give it user input, and print its replies.
  */
 public static void main(String[] args)
 {
  Scanner in = new Scanner (System.in);
  Magpie maggie = new Magpie();
  
  System.out.print (maggie.getGreeting());
  String statement = in.nextLine();
  
  while (!statement.equals("Bye"))
  {
   System.out.println (maggie.getResponse(statement));
   statement = in.nextLine();
  }
  in.close();
 }

}
