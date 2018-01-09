import java.util.*;
public class TestPerson {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("What is your name? : ");
   String name = scan.nextLine();
   System.out.println("What how old are you? : ");
   int age = scan.nextInt();
   System.out.println("What how many inches tall are you? : ");
   int inches = scan.nextInt();
   
   Person person = new Person(name,inches,age);
   
   System.out.println(name + " is " + person.inchesToFeet() + " tall and is " + person.getAge() + " years old. He will be 100 in " + person.yearsTo100() + " years");
   System.out.println("He is "+person.toDogYears()+ " in dog years.");
  }
}