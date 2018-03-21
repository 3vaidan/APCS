public abstract class Coin implements Money{
 public int coinValue;
 public Coin(int value) {
  coinValue = value;
 }
 public double getAmount() {
  return coinValue/100.0; 
 }
}