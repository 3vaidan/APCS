import java.util.*;
public class Period3 {
  
  public static int binarySearch(ArrayList<String> students,int low, int high, String name) {
   int middle = (high-low)/2 + low;
   if(high-low <=1) return -1;
   if(name.compareTo(students.get(middle)) < 0) { 
     return binarySearch(students,low,middle,name);
   } else if (name.compareTo(students.get(middle)) > 0) {
    return binarySearch(students,middle,high,name); 
   } else if (name.equals(students.get(middle))) {
    return middle; 
   }
   
   return -1;
                                               
  }
 
  
  public static int search(ArrayList<String> students, String name){
    return students.indexOf(name);
  }
 
  
  public static void main(String[] args) {
   ArrayList <String> students = new ArrayList<String>(13);
   
   students.add("Alex");
   students.add("Ben");
   students.add("Colin");
   students.add("Grant");
   students.add("Harrison");
   students.add("Hudson");
   students.add("Jack");
   students.add("Jacob");
   students.add("Julia");
   students.add("Maggie");
   students.add("Matt");
   students.add("Sammie");
   students.add("Wes");
   System.out.println("Original list:");
   System.out.println(students);
   
   String name = "Sammie";
   System.out.println("Binary Search: " +name);
   int index = binarySearch(students,0,students.size()-1,name);
   if(index > -1) System.out.println("You found " + name + " at " +index);
   else System.out.println(name + " was not found.");
   System.out.println("==========");
   Collections.shuffle(students);
   System.out.println("Shuffled: " + students);
   System.out.println("Sequential Search: " +name);
   index = search(students,name);
   if(index > -1) System.out.println("You found " + name + " at " +index);
   else System.out.println(name + " was not found.");
   System.out.println(" === NOT FOUND ===");
   name = "Frank";
   System.out.println("Binary Search: " +name);
   index = binarySearch(students,0,students.size()-1,name);
   if(index > -1) System.out.println("You found " + name + " at " +index);
   else System.out.println(name + " was not found.");
   System.out.println("==========");
   Collections.shuffle(students);
   System.out.println("Shuffled: " + students);
   System.out.println("Sequential Search: " +name);
   index = search(students,name);
   if(index > -1) System.out.println("You found " + name + " at " +index);
   else System.out.println(name + " was not found.");
  }
}