package basics.step5.java;

/*
 * A class that represents the concept of a rectangle,
 * positioned at the coordinates (x,y)
 * and dimensioned by (width,height).
 */
public class Rectangle {
  public int x, y, width, height;

  /*
   * Constructors are a bit help, the initialization code
   * is written only once. It is clearly identified, it is
   * therefore easy to find how an object is initialized.
   */
  public Rectangle(int x, int y, int w, int h) {
    this.x = x;  
    this.y = y;   // note: you must write this.x because x is the argument
    width = w;    
    height = h;   // note the coloring, Eclipse shows you the fields in blue
                  // and the local variables/arguments in black. Cool.
  }
  
  /*
   * Look how nice it is to have methods on a class,
   * rather than defining functions such as:
   * 
   *    translate_point(Point p, int dx, int dy)
   * 
   * It makes more sense, it is clearer to read.
   * The "this" variable is automatically added for you.
   * Nice, right?
   */
  public void translate(int dx, int dy) {
    x += dx;
    y += dy;
  }

  /*
   * Java supports overloading, that is, multiple methods with the same
   * name. This is not possible in C, you would have to write:
   * 
   *    translate_point(Point p, int dx, int dy)
   *    tranlsate_point_with_point(Point p, Point t)
   * 
   * Ugly, cumbersome, a real pain.
   * This is so much easier!
   */
  public void translate(Point t) {
    x += t.x;
    y += t.y;
  }

  /*
   * Just stretch the rectangle to a new dimension.
   * See how invoking this method changes the receiver.
   * The method is on this class because it modifies an instance
   * of this class.
   * Note: look at the other methods, the same is true.
   *       this is why those methods are on this class.
   */
  public void stretch(int dw, int dh) {
    width += dw;
    height += dh;
  }
  
  /*
   * But sometimes, some methods are also accessing other objects
   * than the receiver. This is OK too.
   * The receiver is a rectangle object.
   * The argument is a point object.
   * In this case, no object gets modified.
   */
  public boolean contains(Point p) {
    if (p.x < x || p.x >= (x + width))
      return false;
    if (p.y < y || p.y >= (y + height))
      return false;
    return true;
  }
  
  public Rectangle (Point p, int w, int h) {
	  this(p.x,p.y,w,h);
  }

  public Rectangle (Rectangle r) {
	  x=r.x;
	  y=r.y;
	  width = r.width;
	  height = r.height;
  }
}