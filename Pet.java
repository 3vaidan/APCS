/**
 * Defines the class pet object with kind, breed, name, age and weight as attributes*/
public class Pet {
  //////////// fields
  private String kind; //ex bird dog
  private String breed; //ex terrier
  private String name;
  private int age;
  private double weight;
  
  //////////// constructors
  /**Defines pet with kind*/
  public Pet(String k) {
   kind = k;
   breed = null;
   name = null;
   age = 0;
   weight = 0;
  }
  
  /**Defines pet with kind and breed*/
  public Pet(String k, String b) {
   kind = k;
   breed = b;
   name = null;
   age = 0;
   weight = 0;
  }
  
  /** Definds pet with kind breed and name */
  public Pet(String k, String b, String n) {
   kind = k;
   breed = b;
   name = n;
   age = 0;
   weight = 0;
  }
  
  /**defines pet with kind, breed, name, and age */
  public Pet(String k, String b, String n, int a) {
   kind = k;
   breed = b;
   name = n;
   age = a;
   weight = 0;
  }
  
  /**defines pet with kind, breed, name, and age and weight */
  public Pet(String k, String b, String n, int a, double w) {
   kind = k;
   breed = b;
   name = n;
   age = a;
   weight = w;
  }
  
  //////////// methods
  //accesor
  
  /**get kind*/
  public String getKind() {
   return kind; 
  }
  
  /**get breed*/
  public String getBreed() {
   return breed; 
  }
  
  /**get name*/
  public String getName() {
   return name; 
  }
  
  /**get age*/
  public int getAge () {
    return age;
  }
  
  /**get weight*/
  public double getWeight () {
    return weight;
  }
  
  //mutator
  
  /**change kind */
  public void changeKind(String k) {
   kind = k; 
  }
  
  
  /**change breed */
  public void changeBreed(String b) {
   breed = b; 
  }
  
  
  /**change name */
  public void changeName(String n) {
   name = n;
  }
  
  
  /**change age */
  public void changeAge (int a) {
   age = a; 
  }
  
  /**change weight */
  public void changeWeight (double w) {
   weight = w;
  }
  
  /**describes the pet*/
  public String toString() {
   return name + " is a " + breed + " " + kind + " that is " + age + " years old and weighs " + weight + " pounds"; 
  }
  
  public static void main(String[] args) {
    Pet pet = new Pet("dog","cockapoo","Matt",12);
    pet.changeAge(4);
    
    System.out.println(pet.getName());
  }
  
}