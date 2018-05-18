public class Plus
{
  private String chars = "+++++++++";
  
  public void printSome(int n)
  {
    if (n>1)
      printSome(n-1);
    System.out.println(chars.substring(0,n));
  }
}