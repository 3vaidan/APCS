public class DieTest {
  public static void main (String[] args) {
 Die die = new Die();
 for(int x = 0; x < 20; x++) {
 die.roll();
 System.out.println(die.getNumDots());
 }
  }
}
  
