import java.util.Scanner;
public class twoArrays {
  public static void main(String[] args) {
    String scaned;
    Scanner scan = new Scanner(System.in);
    int[][] finish = new int[4][4];
    int sum,sum2;
    int num = 0;
    int[] start = new int[16];
    do {
      for(int i = 0; i < start.length; i++)
        start[i] = i + 1;
      
    for(int num2 : start) {
     System.out.print(num2 + " "); 
    }
    System.out.println("*******************");
    
    
    for(int i = 0; i < finish.length; i++) {
      for(int k = 0; k < finish[0].length; k++) {
        do {
        num = (int)(Math.random()*start.length);
        } while(start[num] == -1);
        finish[i][k] = start[num];
       start[num] = -1;
      }
    }
    
    for(int num2 : start) {
     System.out.print(num2 + " "); 
    }
     System.out.println("*******************");
     
    for(int i = 0; i < finish.length; i++) {
      for(int k = 0; k < finish[0].length; k++) {
        System.out.print(finish[i][k] + " ");
      }
      System.out.println("");
    }
    System.out.println("*******************");
    sum = finish[0][0] + finish[3][3] + finish[3][0] + finish[0][3];
    System.out.println("Sum: " + sum);
    sum2 = finish[1][1] + finish[1][2] + finish[2][1] + finish[2][2];
    System.out.println("Sum2: " + sum2);
    System.out.println("Wanna do it again?");
    scaned = scan.nextLine();
  } while(!scaned.equals("No"));
  
}
}