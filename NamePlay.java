import java.util.*;
public class NamePlay {
  private static ArrayList<String> nameList = new ArrayList();
 public static void main (String[] args) {
   nameList.add("Matt");
   nameList.add("Wes");
   nameList.add("Jack");
   nameList.add("Jacob");
   nameList.add("Ben");
   for(int i = 0; i < nameList.size(); i++) {
    System.out.println(nameList.get(i)); 
   }
   System.out.println("=========");
   nameList.add("Hudson");
   nameList.add("Alex");
   for(int i = 0; i < nameList.size(); i++) {
    System.out.println(nameList.get(i)); 
   }
   System.out.println("=========");
   nameList.set(0,"Olson");
   nameList.set(4,"Henry");
   for(int i = 0; i < nameList.size(); i++) {
    System.out.println(nameList.get(i)); 
   }
   System.out.println("=========");
   System.out.println(nameList.get(0));
   System.out.println(nameList.get(nameList.size()-1));
   System.out.println("=========");
   nameList.remove((nameList.size()-1)/2);
    for(int i = 0; i < nameList.size(); i++) {
    System.out.println(nameList.get(i)); 
   }
   System.out.println("=========");
 }
}