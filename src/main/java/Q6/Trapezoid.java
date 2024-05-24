package Q6;

public class Trapezoid implements TwoDimensionalShape {
  public double a, b, s, h;
  public Trapezoid(double a, double b, double s, double h) {
    this.a = a;
    this.b = b;
    this.s = s;
    this.h = h;
  }
  public double getArea(){return ((a+b)/2)*h;}
  public double getPerimeter(){return a+b+s+s;}
  public int getNumOfEdges(){return 4;}
  public int getNumOfCorners(){return 4;}
}