package Q6;

public class Parallellogram implements TwoDimensionalShape {
  public double b, s, h;
  public Parallellogram(double b, double s, double h) {
    this.b = b;
    this.s = s;
    this.h = h;
  }
  public double getArea(){return b*h;}
  public double getPerimeter(){return (b*2)+(h*2);}
  public int getNumOfEdges(){return 4;}
  public int getNumOfCorners(){return 4;}
}