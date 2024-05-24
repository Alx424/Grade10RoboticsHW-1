package Q6;

public class EquilateralTriangle implements TwoDimensionalShape {
  public double s, h;
  public EquilateralTriangle(double s) {
    this.s = s;
    this.h = Math.sqrt(Math.pow(s, 2)-Math.pow(s/2, 2));
  }
  public double getArea(){return 0.5*s*h;}
  public double getPerimeter(){return s*3;}
  public int getNumOfEdges(){return 3;}
  public int getNumOfCorners(){return 3;}
}