import java.lang.*;
class Playground {
    public static void main(String[ ] args) {
        int a = 65223;
        String num = a + "";
        System.out.println(num.substring(num.length() - 1,num.length()));
    }
}