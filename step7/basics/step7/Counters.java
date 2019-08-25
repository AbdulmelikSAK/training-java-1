package basics.step7;

public class Counters {
  
  static int nRounds;
  static int nRound;
  static int nSmooths;
  static int nSmooth;


  static final boolean OPTIMIZED_SMOOTHER = false;
  static final boolean OPTIMIZED_GROW = true; // set to true to avoid allocating lines
  static final boolean OPTIMIZED_DRAW = true; // set to true to avoid allocating lines
  
  static int nPoints = 0;
  static int nLines = 0;
  static int nPolygons = 0;
  static int nCircles = 0;
  static int nPointArrays = 0;

  static int nCircleDraws = 0;
  static int nPolygonDraws = 0;
  static int nLineDraws = 0;
  static int nCircleSmooths = 0;

  static long elapsedCircleDraws = 0;
  static long elapsedCircleSmooths = 0;
  static long elapsedPolygonDraws = 0;

  static void echo() {
    long elapsed;
    System.out.println("  nPoints=" + nPoints);
    System.out.println("  nLines=" + nLines);
    System.out.println("  nPolygons=" + nPolygons);
    System.out.println("     nPointArrays=" + nPointArrays);
    System.out.println("  nCircles=" + nCircles);
    System.out.println();
    System.out.println("  nCircleDraws=" + nCircleDraws);
    elapsed = elapsedCircleDraws / 1000;
    System.out.println("     elapsed=" + elapsed + "us");
    System.out.println("  nPolygonDraws=" + nPolygonDraws);
    System.out.println("     nLineDraws=" + nLineDraws);
    elapsed = elapsedPolygonDraws / 1000;
    System.out.println("     elapsed=" + elapsed + "us");
    System.out.println();
    System.out.println("  nCircleSmooths=" + nCircleSmooths);
    elapsed = elapsedCircleSmooths / 1000;
    System.out.println("    elapsed=" + elapsed + "us");

  }
}
