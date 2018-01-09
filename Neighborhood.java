/**
 * Creates a collection of information about houses in a neighborhood.
 * Mrs. Westervelt
 * 9/21/16
 */
public class Neighborhood
{
  /** Program to use the House class*/
  public static void main(String [] args)
  {
    House sally = new House(18, "Mayflower Rd");
    House billy = new House(21, "Mayflower Rd", "red", 4, 2.5);
    
    System.out.println(sally);
    System.out.println(billy);
    
    sally.changeNumber(6);
    sally.changeStreet("Plymouth Rd");
    sally.changeColor("blue");
    sally.changeBedrooms(5);
    sally.changeBathrooms(2.5);
    
    System.out.println(sally.getNumber() + " " + sally.getStreet());
    System.out.println(sally.getColor());
    System.out.println(sally.getBedrooms() + " bedrooms and "+sally.getBathrooms() + " bathrooms");
  }
  
}