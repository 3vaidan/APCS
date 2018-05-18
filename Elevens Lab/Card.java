public class Card {
 private String rank;
 private String suit;
 private int value;
 
 public Card(String r, String s, int v) {
  rank = r;
  suit = s;
  value = v;
 }
 
 public String getRank(){
   return rank;
 }
 public String getSuit(){
   return suit;
 }
 public int getValue(){
   return value;
 }
 
 public boolean matches(Card other) {
  return this.getRank().equals(other.getRank()) && this.getSuit().equals(other.getSuit()) && this.getValue() == other.getValue(); 
 }
 
 public String toString() {
  return rank + " of " + suit; 
 }
}