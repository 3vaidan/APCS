import java.util.*;
public class IndexEntry {
 private String word;
 private ArrayList<Integer> numsList;

 public IndexEntry (String w){
  word = w.toLowerCase();
 }

 public void add(int num) {
  numsList.add(num);
 }

 public String getWord() {
   return word;
 }

 public String toString() {
  return "Array: " + numsList + " - Word: "+word;
 }
}
