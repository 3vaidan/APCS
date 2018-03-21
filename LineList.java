import java.util.*;
public class LineList {
 private ArrayList<String> arr;
 
 public LineList() {
  arr = new ArrayList<String>(); 
 }
 
 public int size() {
  return arr.size(); 
 }
 
 public String get(int k) {
  return arr.get(k); 
 }
 
 public void add(String line) {
  arr.add(line); 
 }
 
 public String remove(int k) {
   String temp = arr.get(k);
  arr.remove(k);
  return temp;
 }
 
 public void move(int index, int newIndex) {
   String temp = arr.get(index);
   arr.remove(index);
   arr.add(newIndex,temp);
 }
 
 public void shuffle() {
  int n = arr.size();
  while(n >= 2) {
    Collections.swap(arr,getRandom(n),getRandom(n));
    n--;
  }
  
 }
 
 private int getRandom(int n) {
   return (int)((Math.random() + 1)*n);
 }
 
 
}