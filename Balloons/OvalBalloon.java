import java.awt.*;

public class OvalBalloon extends Balloon {
  public OvalBalloon () {
    super();
  }
  
  public OvalBalloon(int x, int y, int r, Color c) {
   super(x,y,r,c); 
  }
  
  public void draw(Graphics g, boolean makeItFilled) {
   g.setColor(getColor());
   int r = getRadius();
   int x = getX();
   int y = getY();
   
   if(makeItFilled) {
     g.fillOval(x-r,y-r,r,2*r);
   } else {
    g.drawOval(x-r,y-r,r,2*r); 
   }
  }
  
  
}