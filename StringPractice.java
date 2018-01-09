public class StringPractice {
  public static String dateOrder(String dateStr) {
    return dateStr.substring(3,5) + "-" + dateStr.substring(0,2) + "-" + dateStr.substring(6,10);
  }
  
  public  static String convertName(String name) {
   String[] parts = name.split(",");
   return parts[1] + " " + parts[0];
  }
  
  public static String lastLongest(String sentence) {
    String longest = "";
    String alpha = "";
    String[] words = sentence.split(" ");
    
    for(int i = 0; i<words.length;i++) {
      if(words[i].length() > longest.length()) {
        longest = words[i];
        
      }
      if(alpha == "" || words[i].compareTo(alpha) > 0) {
      alpha = words[i];
      }
    }
    return longest+ " - " + alpha;
    
  }
  
  public static String bonus (String date) {
    int monthSlash = 0; 
    int daySlash = 0; 
    boolean foundFirstSlash = false; 
    for(int i = 0; i < date.length(); i++){ 
      if(date.charAt(i) == '/'){ 
        if(!foundFirstSlash){ 
          monthSlash = i; 
          foundFirstSlash = true; 
        } 
        else{ 
          daySlash = i; 
        } 
      } 
    } 
    
    String month = date.substring(0,monthSlash); 
    String day = date.substring(monthSlash+1,daySlash); 
    String year = date.substring(daySlash+1,date.length());
   String result = day + "-" + month + "-" + year; 
    
    return result; 
  }
  
  public static void main(String[] args) {
   System.out.println(lastLongest("this is a random sentence alpha zulu")); 
  // System.out.println(bonus("2/7/10")); 
  }
}