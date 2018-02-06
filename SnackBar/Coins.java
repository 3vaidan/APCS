import java.util.Scanner;
public class Coins {
 private int cents;
 private int quarters;
 private int dimes;
 private int nickles;
 private int pennies;
 public Coins(int c) {
  cents=c;
  quarters=returning(c, 25);
  c-=quarters*25;
  dimes=returning(c, 10);
  c-=dimes*10;
  nickles=returning(c, 5);
  c-=nickles*5;
  pennies=c;
 }
 public int getQuarters()
 {
  return quarters;
 }
 public int getDimes()
 {
  return dimes;
 }
 public int getNickles()
 {
  return nickles;
 }
 public int getPennies()
 {
  return pennies;
 }
 
 private int returning(int change, int num)
 {
  if(change==0||change<num)
   return 0;
  else
  {
   if(change%num<0)
    return change&num;
   else
   {
    int i=0;
    for(;change>=num;i++)
    {
     change-=num;
    }
    return i;
   }
  }
 }
 
 public static void main(String[] args) {
  Scanner kbod = new Scanner(System.in);
  Coins c = new Coins(kbod.nextInt());
  System.out.println(c.quarters+", "+c.dimes+", "+c.nickles+", "+c.pennies);
 }
}