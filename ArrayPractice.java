import java.util.Scanner;
public class ArrayPractice {
  public static int[] fillArray(int[] arr) {
   for(int i = 0; i < arr.length; i++)
     arr[i] = (int)(Math.random() * 50) + 1;
   return arr;
  }
  
  public static void printArray(int[] arr) {
    for (int num : arr) {
     System.out.print(num + " "); 
    }
  }  
  
  public static int arraySum(int[] arr) {
   int sum = 0;
   for (int num : arr) {
     sum += num;
   }
   return sum;
  }
  
  public static double arrayAvg(int[] arr) {
   return arraySum(arr)/(double)arr.length;
  }
  
  public static int arraySm(int[] arr) {
   int smallest = Integer.MAX_VALUE; 
   for (int num : arr) {
     if(smallest > num) {
     smallest = num;
     }
   }
   return smallest;
  }
  
   public static int arrayLg(int[] arr) {
   int smallest = Integer.MIN_VALUE; 
   for (int num : arr) {
     if(smallest < num) {
     smallest = num;
     }
   }
   return smallest;
  }
   
   public static boolean arraySearch(int[] arr,int num) {
     for (int num2 : arr) {
      if(num2 ==num)
        return true;
     }
     return false;
   }
  public static void main (String [] args)
  {
    Scanner kb = new Scanner(System.in);
    int [] numbers = new int[20]; //Declares an array of 20 integers
    fillArray(numbers);
    printArray(numbers);
    System.out.println("Sum: "+arraySum(numbers));
    System.out.println("Avg: "+arrayAvg(numbers));
    System.out.println("Smallest number: "+arraySm(numbers));
    System.out.println("Largest number: "+arrayLg(numbers));
    //Asks the user for a number within 1-50 inclusive.
    System.out.print("Enter a number between 1 and 50");
    int guess = kb.nextInt();
    System.out.println("Is "+guess+" in the array? "+arraySearch(numbers,guess));  
    kb.close();
  }
}

