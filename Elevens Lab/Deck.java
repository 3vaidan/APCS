import java.util.List;
import java.util.ArrayList;

//The Deck class represents a deck of cards.
public class Deck 
{

 private List<Card> cards;  //contains all the cards in the deck.

 /**
  * size is the number of not-yet-dealt cards.
  * Cards are dealt from the top (highest index) down.
  * The next card to be dealt is at size - 1.
  */
 private int size;

 /**
  * Creates a new deck instance.
  * It pairs each element of ranks with each element of suits,
  * and produces one of the corresponding card.
  * @param ranks is an array containing all of the card ranks.
  * @param suits is an array containing all of the card suits.
  * @param values is an array containing all of the card point values.
  */
 public Deck(String[] ranks, String[] suits, int[] values) {
   cards = new ArrayList<Card>();
   for (int j = 0; j < ranks.length; j++) {
   for (String suitString : suits) {
    cards.add(new Card(ranks[j], suitString, values[j]));
   }
  }
   size = cards.size();
 }


 /**
  * Determines if this deck is empty (no undealt cards).
  * @return true if this deck is empty, false otherwise.
  */
 public boolean isEmpty() {
  return size == 0;
 }
 

 /**
  * Accesses the number of undealt cards in this deck.
  * @return the number of undealt cards in this deck.
  */
 public int size() {
  return size;
 }

 /**
  * Deals a card from this deck.
  * @return the card just dealt, or null if all the cards have been
  *         previously dealt.
  */
 public Card deal() {
   if(size == 0) return null;
  Card card = cards.get(size - 1);
  size -= 1;
  return card;
 }

 /**
  * Generates and returns a string representation of this deck.
  * @return a string representation of this deck.
  */
 @Override
 public String toString() {
  String rtn = "size = " + size + "\nUndealt cards: \n";

  for (int k = size - 1; k >= 0; k--) {
   rtn = rtn + cards.get(k);
   if (k != 0) {
    rtn = rtn + ", ";
   }
   if ((size - k) % 2 == 0) {
    // Insert carriage returns so entire deck is visible on console.
    rtn = rtn + "\n";
   }
  }

  rtn = rtn + "\nDealt cards: \n";
  for (int k = cards.size() - 1; k >= size; k--) {
   rtn = rtn + cards.get(k);
   if (k != size) {
    rtn = rtn + ", ";
   }
   if ((k - cards.size()) % 2 == 0) {
    // Insert carriage returns so entire deck is visible on console.
    rtn = rtn + "\n";
   }
  }

  rtn = rtn + "\n";
  return rtn;
 }
 
 public void shuffle() {
   int k;
   for(int i = 0; i<cards.size(); i++) {
     k = (int)(Math.random() * i);
     Card a = cards.get(k);
     cards.set(k,cards.get(i));
     cards.set(i,a);
   }
 }
}
