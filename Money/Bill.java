public class Bill implements Money {
  public int value;
 public Bill(int valu) {
  value = valu;
 }
 public double getAmount() {
  return (double)value; 
 }
 public String toString() {
  return "$"+value; 
 }

}