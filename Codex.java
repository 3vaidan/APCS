public class Codex {
  public static void main(String[] args) {
    int[][] w = 
    for(int row = 0; row < w.length; row++)
    {
      for (int col = 0; col < w[0].length; col++) {
       w[row][col] = 10+row[col];
       System.out.print(w[row][col] + " ");
      }
System.out.println();
    }
  }
}