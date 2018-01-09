public class Test {
 private String test = "sdjfsk;ldfjkl;sdfj;sklf Model#345345345";
 public void main(String[] args) {
  String[] parts = test.split("Model#");
  System.out.println(parts[1]);
 }
}