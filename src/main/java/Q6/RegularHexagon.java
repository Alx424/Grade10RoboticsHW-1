package Q6;

public class RegularHexagon implements TwoDimensionalShape {
  public double s;
  public RegularHexagon(double s) {
    this.s = s;
  }
  public double getArea(){return (3*Math.sqrt(3))/2*Math.pow(s, 2);}
  public double getPerimeter(){return 6*s;}
  public int getNumOfEdges(){return 6;}
  public int getNumOfCorners(){return 6;}
}