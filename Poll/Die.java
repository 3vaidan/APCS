import java.util.Random;
public class Die {
 private int dots;
 
 public void roll() {
   Random rand = new Random();
   dots = rand.nextInt(6) + 1;
 }
 
 public int getNumDots() {
  return dots; 
 }
}