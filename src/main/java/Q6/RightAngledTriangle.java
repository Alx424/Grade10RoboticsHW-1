package Q6;

public class RightAngledTriangle implements TwoDimensionalShape {
  public double b, h;
  public RightAngledTriangle(double b, double h) {
    this.b = b;
    this.h = h;
  }
  public double getArea(){return 0.5*b*h;}
  public double getPerimeter(){return b+h+Math.sqrt((b*b)+(h*h));}
  public int getNumOfEdges(){return 3;}
  public int getNumOfCorners(){return 3;}
}