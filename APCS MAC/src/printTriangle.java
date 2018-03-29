/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbergwall2222
 */
public class printTriangle {
   
    
    public static String printStars(int n) {
        if (n == 0) {
            return "";
        }
        else {
            String p = printStars(n-1);
            p += "*";
            System.out.println(p);
            return p;
        }
        
    }
    
    public static String getStars(int n) {
        if(n == 0) {
            return "";
        } else {
            String p = getStars(n-1);
            p += "*";
            return p;
        }
    }
    
    public static String printReverse(int n) {
        if(n == 0) {return "";}
        String p = "";
        p = getStars(n);
        System.out.println(p);
        printReverse(n-1);
        return p;
    }
     public static void main(String[] args) {
        // printStars(5);
        printReverse(5);
    }
}
