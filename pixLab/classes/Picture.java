import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  
 * This class inherits from SimplePicture and 
 * allows the student to add functionality to the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output; 
  }
  
   public void keepOnlyBlue(){
        Pixel[][] pixels = this.getPixels2D();
        for ( Pixel[] rowArray : pixels )
        {
            for ( Pixel pixelObj : rowArray )
            {
                pixelObj.setRed( 0 );
                pixelObj.setGreen( 0 );
            }
        }
   }
   
   public void negate() {
     Pixel[][] pixels = this.getPixels2D();
        for ( Pixel[] rowArray : pixels )
        {
            for ( Pixel pixelObj : rowArray )
            {
                pixelObj.setRed(255 - pixelObj.getRed());
                pixelObj.setGreen(255 - pixelObj.getGreen() );
                pixelObj.setBlue(255 - pixelObj.getBlue() );
            }
        }
   }
   
   public void grayscale() {
     Pixel[][] pixels = this.getPixels2D();
        for ( Pixel[] rowArray : pixels )
        {
            for ( Pixel pixelObj : rowArray )
            {
              int avg = (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3;
                pixelObj.setRed(avg);
                pixelObj.setGreen(avg);
                pixelObj.setBlue(avg);
            }
        }
   }
   
   public void mirrorVertical() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for(int row = 0; row < pixels.length; row++) {
      for(int col = 0; col < width/2; col++) {
       leftPixel = pixels[row][col];
       rightPixel = pixels[row][width - 1 - col];
       rightPixel.setColor(leftPixel.getColor());
      }
    }
   }
   
    public void mirrorHorizontal() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for(int row = 0; row < height/2; row++) {
      for(int col = 0; col < pixels[0].length; col++) {
       topPixel = pixels[row][col];
       bottomPixel = pixels[height - 1 - row][col];
       bottomPixel.setColor(topPixel.getColor());
      }
    }
   }
    
    public void halfBlack() {
     Pixel[][] pixels = this.getPixels2D();
     int height = pixels.length;
     for(int row = 0; row < height/2; row++) {
      for(int col = 0; col < pixels[0].length; col++) {
       pixels[row][col].setColor(Color.black);
      }
    }
    }
    
    public void mirrorDiagonal() {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      for (int row = 0; row < pixels[0].length && row < pixels.length; row++) {
        for (int col = row + 1; col < pixels[0].length && col < pixels.length; col++) {
          topPixel = pixels[row][col];
          bottomPixel = pixels[col][row];
          topPixel.setColor(bottomPixel.getColor());
        }
      }
 }

  
  /* Main method for testing - each class in Java can have a main method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("lul.jpg");
    /*beach.keepOnlyBlue();
    beach.negate();
    beach.grayscale();
    beach.mirrorVertical();
    beach.mirrorHorizontal();
    beach.halfBlack();
    beach.mirrorDiagonal();*/
    beach.explore();
   // Picture photo = new SimplePicture();
    /*SimplePicture photo2 = new Picture("beach.jpg");
    Picture photo3 = new SimplePicture(); 
    DigitalPicture photo4 = new SimplePicture();*/
    
  }
  
} // this } is the end of class Picture, put all new methods before this
