package Q6;

public class Square implements TwoDimensionalShape {
  public double s;
  public Square(double s) {
    this.s = s;
  }
  public double getArea(){return s*s;}
  public double getPerimeter(){return s*4;}
  public int getNumOfEdges(){return 4;}
  public int getNumOfCorners(){return 4;}
}