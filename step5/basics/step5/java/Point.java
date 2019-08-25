package basics.step5.java;

/*
 * A class that represents the concept of a point,
 * positioned at the coordinates (x,y)
 */
public class Point {
  public int x;
  public int y;

  /*
   * Constructors are an easy-to-use concept.
   * Look, you can have multiple constructors,
   * one for each way that you can construct an object
   * of this class.
   */
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  
  public Point (Point p) {
	  this(p.x,p.y);
  }

  /*
   * Isn't this nicer than to have to write
   * 
   *    translate_point(Point receiver, int dx, int dy);
   *    
   * The "this" variable is automatically managed for you.
   */
  public void translate(int dx, int dy) {
    x += dx;
    y += dy;
  }
}