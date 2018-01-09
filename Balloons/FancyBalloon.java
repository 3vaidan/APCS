import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
public class FancyBalloon extends Balloon {
  public FancyBalloon () {
    super();
  }
  
  public FancyBalloon(int x, int y, int r, Color c) {
   super(x,y,r,c); 
  }
  
  public void draw(Graphics g, boolean makeItFilled) {
   g.setColor(getColor());
   int r = getRadius();
   int x = getX();
   int y = getY();
   
   if(makeItFilled) {
     try{
  final BufferedImage image = ImageIO.read(new File("https://lh3.googleusercontent.com/-wCPHCh1DUOo/Vrol5OtLw3I/AAAAAAAAABI/Oyo5hJqFhMo/w370-h369/WWE_big_black_guy_for_site.jpg"));
      g.drawImage(image, x, y, null);
     }catch(IOException e){
  e.printStackTrace();
     }
     
   } else {
    try{
  final BufferedImage image = ImageIO.read(new File("S:\\DHS\\AP Computer Science 2017-2018\\Matthew Bergwall\\Balloons\\meme.jpg"));
      g.drawImage(image, x, y, null);
     }catch(IOException e){
  e.printStackTrace();
     }
   }
  }
  
  
}