package basics.step4;

public class JavaBasicsStep4 {

  /*
   * This is just a helper function.
   * Please set a breakpoint on the line that calls System.exit().
   * That way, if your program exists, the debugger will suspend the execution 
   * and you will be able to see why the program exited.
   */
  static void exit(int code) {
    System.out.printf("Exit: %d\n", code);
    System.exit(code);
    // the execution flow never comes back 
    // from System.exit.
  }

  static void exit(int code, String msg) {
    System.out.printf("%s\n", msg);
    exit(code);
  }

  /*
   * This is just a helper function.
   */
  static void ensure(boolean cond) {
    if (!cond)
      exit(-1, "Ensure failed.");
  }

  public static void main(String[] args) {

    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();
    
    p1.x = 10;
    p1.y = 11;

    p2.translate(20, 22);

    Line l1 = new Line(p1,p2);
    /*l1.start = p1;
    l1.end = p2;*/

    l1.translate(2, -2);

    Line l2 = new Line(p2,p3);
    /*l2.start = p2;
    l2.end = p3;*/
    
    l2.translate(54, -12);
    
    Line l3 = new Line(l2);
    l3.translate(1, 3);
        
    System.out.println("That's all folks.");
  }

}
