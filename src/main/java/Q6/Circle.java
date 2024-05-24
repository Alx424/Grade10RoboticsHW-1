package Q6;

public class Circle implements TwoDimensionalShape {
  public double r;
  public Circle(double r) {
    this.r = r;
  }
  public double getArea(){return Math.PI*r*r;}
  public double getPerimeter(){return 2*Math.PI*r;}
  public int getNumOfEdges(){return 1;}
  public int getNumOfCorners(){return 0;}
}