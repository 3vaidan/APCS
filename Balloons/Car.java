/**
 * Car class
 * @author Matthew Bergwall
 * 10/2/2017
 */
public class Car {
  /** Model of the car */
  public String model;
  /** Year car waws built */
  public int year;
  
  /** Create object with no constructors 
    */
  public Car () {
   model = null;
   year = 0;
  }
  
  /**Creates object with both attr 
    * @param m = model of the car
    * @param y = year car was built
    */
  public Car(String m, int y) {
   model = m;
   year = y;
  }
  
  /**Get value of model 
    * @returns model 
    */
  public String getModel() {
   return model; 
  }
  
  /**Get value of year 
    * @returns year 
    */
  public int getYear() {
   return year; 
  }
  
  /** Change value of model
    * @param m = model of car
    */
  public void changeModel(String m) {
    model = m;
  }
  
  /** Change value of year
    * @param y = year of car
    */
  public void changeYear(int y) {
    year = y;
  }
  
  public String toString() {
   return "This car is a " + model + " built in " +year; 
  }
  
}