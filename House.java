/** House class
  * @author Matthew Bergwall
  * @date 09/20/2017
  */
public class House {
  /**fields */
 private int number; //ex 5
 private String street; //ex Lantern Lane
 private String color; // ex blue
 private int bedrooms; //ex 3
 private double bathrooms; //ex 1.5
 
 /**constructors */
 
 /**Definds with number and street
   * @input n = number
   * @input s = street
   * @returns void
   */
 public House(int n, String s) {
  number = n;
  street = s;
  color = null;
  bedrooms = 0;
  bathrooms = 0;
 }
 
 /** Defines with everything 
   *@input n = number
   * @input s = street
   * @input b = bedrooms
   * @input ba = bathrooms
   * @returns void
   */
 public House(int n, String s, String c, int b, double ba) {
   number = n;
   street = s;
   color = c;
   bedrooms = b;
   bathrooms = ba;
 }
 
 /** accessors */

 /**getNumber
   * @returns number
   */
 public int getNumber () {
  return number; 
 }
 
  /**get street 
    * @returns street 
    */
 public String getStreet () {
  return street; 
 }
 
  /**get color 
    * @returns color 
    */
 public String getColor () {
  return color; 
 }
 
  /**get bedrooms 
    * @returns bedrooms 
    */
 public int getBedrooms () {
  return bedrooms; 
 }
 
  /**get bathrooms 
    * @returns bathrooms 
    */
 public double getBathrooms () {
  return bathrooms; 
 }
 
 /** mutators */
 
 /** change number 
   * @input n = number
   * @returns void
   */
 public void changeNumber(int n) {
  number = n; 
 }
 
 /** change Street 
   * @input s = street
   * @returns void
   */
 public void changeStreet(String s) {
   street = s;
 }
 
 /** change color 
   * @input c = color
   * @returns void
   */
 public void changeColor(String c) {
  color = c;
 }
 
 /** change bedrooms 
   * @input b = bedrooms
   * @returns void
   */
 public void changeBedrooms(int b) {
  bedrooms = b;
 }
 
 /** change bathrooms 
   * @input b = bathrooms'
   * @returns void
   */
 public void changeBathrooms(double b) {
  bathrooms = b;
 }
 
 //** Accessor to string */
 
 public String toString() {
  return "This house is a "+ color + " house located at " + number + " " + street + " with " +bedrooms + " bedrooms and " +bathrooms+ " baths."; 
 }
 
 
 
 
 
 
 
 
  
  
}