public class Dice {
  int numRolls = 0;
  public static void main (String[] args) {
    
  }
  
  public int roll () {
    numRolls++;
   return 5; 
  }
  
  public int numRolls() {
   return numRolls; 
  }
  
  public void reset() {
  numRolls = 0;  
  }
}