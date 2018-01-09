import java.util.*;
public class Interation {
  
  public static void sumLimit(Scanner scan) {
    
    int sum = 0;
    int num = 0;
    do {
      System.out.println("Next Num?");
      num = scan.nextInt();
      if(num > 0) sum += num;
    } while(num > 0);
      System.out.println(sum);
  }
  
  public static void multipleTo200 (Scanner scan) {
    int current = 0;
    
    System.out.println("What is the multiple");
    int num = scan.nextInt();
    while(current < 200) {
     current += num;
     System.out.println(current);
    }
  }
  
  public static void fizzBuzz (Scanner scan) {
    System.out.println("What is the ending number?");
   
    int current = 0;
    int end = scan.nextInt();
    while(current < end) {
     current++;
     if(current % 3 == 0 && current % 5 == 0) {
      System.out.println("FizzBuzz"); 
     } else if(current %3 == 0 ) {
      System.out.println("Fizz"); 
     } else if(current % 5 == 0 ) {
      System.out.println("Buzz"); 
     } else {
      System.out.println(current); 
     }
    }
  }
  
  public static void printCheckerboard(int n) {
    int current = 0;
    for(int i = 0; i < n; i++) {
      for(int k = 0; k <= n; k++) {
        if(current == 0) {
         System.out.print("o"); 
         current = 1;
        } else {
          System.out.print("#"); 
         current = 0;
      }
        
    }
      System.out.println("");
  }
  }
  
  public static boolean perfectNum(int number){
         
        int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }
        if(temp == number){
            return true;
        } else {
            return false;
        }
    }
  public static void firstPerfectNums() {
   int count = 0;
   int current = 1;
   boolean perfect;
   while(count != 4) {
     perfect = perfectNum(current);
     if(perfect) {
      System.out.println(current);
      count++;
      current++;
     } else {
      current++; 
     }
   }
  }
  
  public static boolean isPrime(int N)
  {
    for (int i = 2;i<=Math.sqrt(N);i++)
    {
      if (N%i == 0)
        return false;
    }
    return true;
  }
  
  public static void firstPrime() {
    int p = 1;
    int counter = 0;
    int powTwo = 2;
    boolean isPrime = true;

    while(counter < 6) 
    {
      isPrime = true;
        for (int m = 2; isPrime; m++) {
            if (m * m > p) {
                isPrime = true;
                break;
            }
            if (p % m == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            while(powTwo <= p + 1) {
                powTwo *= 2;
                if(powTwo == p + 1) {
                    System.out.println(p);
                    counter++;
                }
            }
        }
        p++;
        powTwo = 2;
    }
  }

  
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
   //Interation.sumLimit(scan);
    //Interation.multipleTo200(scan);
    //fizzBuzz(scan);
    //printCheckerboard(4);
    //System.out.println(Interation.perfectNum(28));
    //Interation.firstPerfectNums();
    Interation.firstPrime();
  }
}