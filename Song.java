/**
 * Creates song class
 * @author Matthew Bergwall
 */
public class Song {
 
  private String title;
  private String artist;
  private double length;
  
  /** 
   * Construct class with parameters
   * @param t = String title
   * @param a = String artist
   * @param l = double length
   */
  public Song(String t,String a,double l) {
    title = t;
    artist = a;
    length = l;
  }
  
  /**Accessors */
  
  /**
   * Get the title of the song
   * @return String title
   */
  public String getTitle() {
   return title; 
  }
  
  /**
   * Get the artist of the song
   * @return String artist
   */
  public String getArtist() {
   return artist; 
  }
  
  /**
   * Get the length of the song
   * @return double length
   */
  public double getLength() {
   return length; 
  }
  
  /** Mutators */
  
  /** 
    * Change the title of the song
    * @param t = String title
    */
  public void changeTitle(String t) {
    title = t;
  }
  
  /** 
    * Change the artist of the song
    * @param a = String artist
    */
  public void changeArtist(String a) {
    artist = a;
  }
  
  /** 
    * Change the length of the song
    * @param l = double length
    */
  public void changeLength(double l) {
    length = l;
  }
  
  /**
   * Returns all attributes
   * @return String
   */
  public String toString() {
   return title + " by " + artist + ". " + length + " seconds long."; 
  }
}