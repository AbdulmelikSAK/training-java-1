package basics.step5.java;

public class JavaBasicsStep5 {

  public static void main(String[] args) {
    Point p = new Point(10, 23);
    Rectangle r1 = new Rectangle(22, 35, 12, 16);
    Rectangle r2 = new Rectangle(5, 4, 100, 150);
    if (r1.contains(p))
      System.out.println("R1 contains the point.");
    if (r2.contains(p))
      System.out.println("R2 contains the point.");
  }

}
