public class ShuffleTest {
  public static void main(String[] args) {
  String[] ranks = {"10","jack", "queen", "king"};
  String[] suits = {"spades", "hearts"};
  int[] values = {10, 11, 12, 13};
  Deck cards = new Deck(ranks, suits, values);
  System.out.println(cards);
  System.out.println("=== SUFFLE === ");
  cards.shuffle();
  System.out.println(cards);
  }
}