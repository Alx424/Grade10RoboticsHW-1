package Q6;

public class Rectangle implements TwoDimensionalShape {
  public double l, w;
  public Rectangle(double l, double w) {
    this.l = l;
    this.w = w;
  }
  public double getArea(){return l*w;}
  public double getPerimeter(){return (2*l)+(2*w);}
  public int getNumOfEdges(){return 4;}
  public int getNumOfCorners(){return 4;}
}