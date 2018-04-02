
public class VendingCompany {
  public static void main(String[] args){
    Vendor[] machines = new Vendor[3];
    machines[0] = new Vendor(45,5);
    machines[1] = new Vendor(50,5);
    machines[2] = new Vendor(35,5);
    for(Vendor m : machines) {
      System.out.print(m + " - ");
    }
    System.out.println();
    System.out.println("*******");
    Vendor[] moreMachines = new Vendor[machines.length + 5];
    for(int i = 0; i < machines.length; i++){
      moreMachines[i] = machines[i];
    }
    for(Vendor m : moreMachines) {
      System.out.print(m + " - ");
    }
    System.out.println();
    System.out.println("*******");
    }
}
