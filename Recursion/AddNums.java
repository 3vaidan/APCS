public class AddNums
{
  public static int sumDigits(int num)
  {
    if (num == 0) return 0;
    else return num + sumDigits(num - 1);
  }
  
  public static void main (String [] args)
  {
    System.out.println(sumDigits(5));
  }
}