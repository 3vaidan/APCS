public class PollTest {
  public static void main(String[] args) {
   PollDisplayPanel votingMachine = new PollDisplayPanel("Matt","Jacob","Jack"); 
   votingMachine.vote1();
   votingMachine.vote1();
   votingMachine.vote2();
   votingMachine.vote3();
   System.out.println(votingMachine);
  }
}