// This program prompts the user to enter miles traveled and
// gas used and calculates the car's gas mileage
import java.util.Scanner;
public class MyMath
{
  public static double gasMileage(int m, double g)
  {  
    return ((int)m/g*100)/100;  //rounds to one decimal place
  }
  
  public static double triangleArea(int base, int height) {
   return base*height/2;
  }
  
  public static double trapezoidArea(int base1, int base2, int height) {
   return ((base1+base2)/2)*height; 
  }
  
  public static void main(String[] args)
  {
    //input
    Scanner keyboard = new Scanner(System.in);    
    System.out.print("Miles traveled: ");
    int miles = keyboard.nextInt();
    System.out.print("Gallons of gas used: ");
    double gallons = keyboard.nextDouble();
   // keyboard.close();
    
    //method calls and output
    System.out.println("Your car's gas mileage was "+ gasMileage(miles, gallons));
    
    System.out.println("What is the height?");
    int height = keyboard.nextInt();
    System.out.println("What is the first base?");
    int base1 = keyboard.nextInt();
     System.out.println("What is the second base?");
    int base2 = keyboard.nextInt();
    System.out.println("What is the height of the triangle?");
    int base = keyboard.nextInt();
    System.out.println("The area of the triangle is "+triangleArea(base,height) + " and the trapezoid area is " + trapezoidArea(base1,base2,height));
    
  }
}
