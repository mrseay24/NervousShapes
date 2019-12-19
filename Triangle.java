// Represents a triangle that can be displayed in a graphics
// context

import java.awt.*;

public class Triangle extends Shape {


 
 
 // Instance variables
  private int triSide;

  // Constructor
  public Triangle(int x, int y, Color color, int triSide) {
    super(x, y, color);
    this.triSide = triSide;
    
  }
  
  
  // Instance methods
  public void draw(Graphics g) {
	  g.setColor(getColor());
	  int[] xPoints = {getX(), getX()+triSide, (getX()+triSide/2)};
      int[] yPoints = {getY(), getY(),(int)(getY()+triSide*Math.sqrt(3)/2)};
     g.fillPolygon(xPoints, yPoints, 3);
  }
  public int getHeight() {
    return triSide;
  }

  public int getWidth() {
    return triSide;
  }

}
