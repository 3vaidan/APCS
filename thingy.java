import java.util.Scanner;
public class thingy {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int current = 0;
    int num = 0;
    int[] nums = new int[9999];
    do {
      System.out.println("What is the next number? Hint: Do -1 to stop.");
      num = scan.nextInt();
      if(num != -1) {
        nums[current] = num;
        current++;
      }
      } while(num != -1);

  for(int n : nums) {
    if(n == 0)
      break;
   for(int i = 0; i < n; i++)
     System.out.print("*");
   System.out.println();
  }
  }
}