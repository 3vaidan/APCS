/**
 * Creates a collection of information about
 * pets of our class.
 * Mrs. Westervelt
 * 9/19/17
 */
public class OurPets
{
  /** Program to use the Pet class*/
  public static void main(String [] args)
  {
    Pet matt = new Pet("dog", "terrier");
    matt.changeName("Matt");
    matt.changeAge(1);
    matt.changeWeight(15.6);
    System.out.println(matt);
   
  }
  
}