public class TestCar {
  public static void main(String[] args) {
   Car first = new Car();
   Car second = new Car("BMW",1997);
   
   System.out.println(first);
   System.out.println(second);
   first.changeModel("GMC");
   first.changeYear(2017);
   System.out.println(first.getModel());
   System.out.println(first.getYear());
  }
}