import java.util.Scanner;
public class Scrabble {
  public static int computeScore(String word) {
    word = word.toLowerCase();
    int total = 0;
   int[] points = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };
   for(int y = 0; y<word.length();y++) {
    total += points[word.charAt(y) - 'a']; 
   }
   return total;
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is da word?");
    String thingy = scan.nextLine();
   System.out.println(computeScore(thingy)); 
  }
}