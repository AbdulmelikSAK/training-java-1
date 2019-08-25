package basics.step7;

import java.awt.Graphics;
import java.io.PrintStream;

public class Polygon {

  Point[] points;
  int npoints;

  Polygon() {
    points = new Point[4];
    npoints = 0;
    Counters.nPolygons++;
  }

  void grow() {
    Point tmp[];
    tmp = new Point[2*npoints];
    System.arraycopy(points, 0, tmp, 0, npoints);
    points = tmp;
    Counters.nPointArrays++;
  }

  /*
   * Adds a point at the end
   */
  void add(Point p) {
    if (npoints == points.length)
      grow();
    points[npoints++] = p;
  }

  /*
   * Adds a point at the given index.
   */
  void add(Point p, int idx) {
    if (npoints == points.length)
      grow();
    for (int i = npoints; i > idx; i--)
      points[i] = points[i - 1];

    points[idx] = p;
    npoints++;
  }

  /*
   * Tells if the this polygon and the given polygon 
   * are the same, that is, if they have their points
   * at the same position
   */
  boolean same(Polygon p) {
    if (npoints != p.npoints)
      return false;
    for (int i = 0; i < npoints; i++)
      if (!points[i].same(p.points[i]))
        return false;
    return true;
  }

  void translate(float dx, float dy) {
    for (int i = 0; i < npoints; i++)
      points[i].translate(dx, dy);
  }

  void translate(Point p) {
    for (int i = 0; i < npoints; i++)
      points[i].translate(p);
  }

  static void print(PrintStream ps, Point p) {
    ps.print('(');
    ps.print(p.x);
    ps.print(',');
    ps.print(p.y);
    ps.print(')');
  }

  void print(PrintStream ps) {
    for (int i = 0; i < points.length; i++)
      print(ps, points[i]);
  }

  /*
   * (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  public String toString() {
    String s = "[";
    for (int i = 0; i < points.length; i++)
      s += points[i].toString();
    s += "]";
    return s;
  }

  /*
   * Draw this circle on the screen through 
   * the given Graphics object,
   * with the circle center at the given origin.
   */
  void draw(Graphics g, Point origin) {
    if (npoints > 1) {
      Point p1, p2;
      for (int i = 0; i < npoints - 1; i++) {
        p1 = points[i];
        p2 = points[i + 1];
        draw(p1,p2,g, origin);
        
      }
      p1 = points[npoints - 1];
      p2 = points[0];
      long start = System.nanoTime();
      draw(p1,p2,g, origin);
      long end = System.nanoTime();
      Counters.nPolygonDraws++;
      Counters.elapsedPolygonDraws +=(end-start);
    }
  }
  void draw ( Point p1, Point p2, Graphics g, Point origin) {
	  int x1,y1,x2,y2;
	  x1=(int)(p1.x + origin.x);
	  y1=(int)(p1.y + origin.y);
	  x2=(int)(p2.x + origin.x);
	  y2=(int)(p2.y + origin.y);
	  g.drawLine(x1, y1, x2, y2);
	  return;
  }
}
