public class Book {
 private String title;
 private String author;
 private int copyright;
 
 public Book (String info) {
   int firstComma = info.indexOf(","); 
   int secondComma = info.indexOf(",",firstComma+1);
   title = info.substring(0,firstComma);
   author = info.substring(firstComma+1,secondComma);
   copyright = Integer.parseInt(info.substring(secondComma+1));
 }
 
 public String getTitle() {
   return title;
 }
 
 public String getAuthor() {
  return author; 
 }
 
 public int getCopyright() {
   return copyright;
 }
 
 public String toString() {
   return title+"\n"+author+"\n"+copyright;
 }
}