public class Minus extends Plus
{
  private String chars = "------------";
  
  public void printSome(int n)
  {
    System.out.println(chars.substring(0,n));
    if (n>1)
      super.printSome(n-1);
  }
}