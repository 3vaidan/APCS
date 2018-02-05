public class testing {
 private String sen = "";
 
 public testing(String s) {
  sen = s; 
 }
 
 public String toString() {
  return sen; 
 }
 
 public int count() {
  int count = 0;
  for(int i = 0; i < sen.length(); i++) {
    switch(Character.toUpperCase(sen.charAt(i))) {
      case 'A':   case 'E':  case 'I':  case 'O':  case 'U': 
        count++;
        break;
        
    }
  }
  return count;
 }
  
}
