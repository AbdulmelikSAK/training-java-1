package basics.step4;

public class Line {
  private Point start;
  private Point end;
  
  /*
   * Translating a line is just translating both points.
   */
  void translate(int dx, int dy) {
    this.start.translate(dx, dy);
    this.end.translate(dx, dy);
  }

  /*
   * Rotating a line is just translating the end point.
   */
  void rotate(int dx, int dy) {
    this.end.translate(dx, dy);
  }
  
  
 /* public Line () {
	  
	  this.start = new Point();
	  this.end = new Point();
	  
  }	*/
  
  public Line (Point p1, Point p2) {
	  
	  this.start = p1;
	  this.end = p2;
	  
  }
  
  public Line (Line lr) {
	  
	  this.start = lr.start;
	  this.end = lr.end;
	  
  }
  
  public Point getStartPoint() {
	  
	  return start;
	  
  }
  
  public Point getEndPoint() {
	  
	  return end;
	  
  }
}
