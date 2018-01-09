import java.awt.Color;
  
public class InflateBalloon extends Balloon{
  private double radius = getRadius();
  public void inflate (int percent) {
    radius = radius * (1+0.01*percent);
  }
}