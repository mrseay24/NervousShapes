// Represents a geometric shape that can be displayed in a
// graphics context

import java.awt.*;

public abstract class Shape {
  // Instance variables
  protected int x;
  protected int y;
  private Color color;

  // Constructor
  protected Shape(int x, int y, Color color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  protected Shape(Color color) {	 
	    this.color = color;
	  }

// Abstract methods
  public abstract void draw(Graphics g);
  public abstract int getHeight();
  public abstract int getWidth();

  // Other instance methods
  public Color getColor() {
    return color;
  }

  protected int getX() {
    return x;
  }

  protected int getY() {
    return y;
  }
  
  
  public void move(int dx, int dy) {
    x += dx;
    y += dy;
  }
  
  public void setColor(Color color) {
    this.color = color;
  }
}
