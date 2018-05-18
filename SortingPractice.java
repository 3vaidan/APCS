import java.util.*;
public class SortingPractice {
  public static void main(String[] args) {
   ArrayList<Integer> arr = getArr(); 
   System.out.println(arr);
   System.out.println(" SELECTION SORT  \n Sorted: " + sSort(arr));
   arr = getArr(); 
   System.out.println(arr);
   System.out.println(" INSERTION SORT  \n Sorted: " + iSort(arr));
   
   arr = getArr(); 
   System.out.println(arr);
   System.out.println(" MERGE SORT  \n Sorted: "+mergeSort(arr));
   
  }
  
  
  private static  ArrayList<Integer> sSort(ArrayList<Integer> arr) {
    int x = arr.size();
    for(int i = 0; i<x-1; i++) {
     int min_idx = i;
     for(int j = i+1; j < x; j++) {
      if(arr.get(j) < arr.get(min_idx))
        min_idx = j;
     }
     int temp = arr.get(min_idx);
     arr.set(min_idx,arr.get(i));
     arr.set(i,temp);
    }
    return arr;
  }
  
  private static ArrayList<Integer> iSort(ArrayList<Integer> arr) {
    int i, j;
    for (i = 1; i < arr.size(); i++) {
        int tmp = arr.get(i);
        j = i;
        while ((j > 0) && (arr.get(j - 1) > tmp)) {
            arr.set(j, arr.get(j - 1));
            j--;
        }
        arr.set(j, tmp);
    }
    return arr;
  }
  
  public static ArrayList<Integer> mergeSort(ArrayList<Integer> whole) {
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int center;
 
        if (whole.size() == 1) {    
            return whole;
        } else {
            center = whole.size()/2;
    
            for (int i=0; i<center; i++) {
                    left.add(whole.get(i));
            }
 
            
            for (int i=center; i<whole.size(); i++) {
                    right.add(whole.get(i));
            }
 
        
            left  = mergeSort(left);
            right = mergeSort(right);
 
            
            merge(left, right, whole);
        }
        return whole;
    }
 
    private static void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;
 

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }
 
        ArrayList<Integer> rest;
        int restIndex;
        if (leftIndex >= left.size()) {

            rest = right;
            restIndex = rightIndex;
        } else {

            rest = left;
            restIndex = leftIndex;
        }
 

        for (int i=restIndex; i<rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }
  
  private static ArrayList<Integer> getArr() {
   ArrayList<Integer> a = new ArrayList<Integer>();
   for(int i = 0; i < 25; i++) {
     a.add((int) (Math.random() * 50 + 1));
   }
   return a;
  }
}