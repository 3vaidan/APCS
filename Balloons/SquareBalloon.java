import java.awt.*;

public class SquareBalloon extends Balloon {
  public SquareBalloon () {
    super();
  }
  
  public SquareBalloon(int x, int y, int r, Color c) {
   super(x,y,r,c); 
  }
  
  public void draw(Graphics g, boolean makeItFilled) {
   g.setColor(getColor());
   int r = getRadius();
   int x = getX();
   int y = getY();
   
   if(makeItFilled) {
     g.fillRect(x-r,y-r,2*r,2*r);
   } else {
    g.drawRect(x-r,y-r,2*r,2*r); 
   }
  }
  
  
}