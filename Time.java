public class Time {
 public int h;
 public int m;
 public Time(int hx, int mx) {
  h = hx;
  m = mx;
 }
 public int toMins() {
  return m + (h * 60); 
 }
 public int elapsedSince(Time t) {
  return this.toMins() - t.toMins();
 }
 public boolean lessThan(Time t) {
  return this.toMins() < t.toMins(); 
 }
 
 public String toString() {
  return h + " hours and " + m +  " minutes."; 
 }
}