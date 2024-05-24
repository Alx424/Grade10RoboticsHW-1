package Q6;

public class RegularPentagon implements TwoDimensionalShape {
  public double s;
  public RegularPentagon(double s) {
    this.s = s;
  }
  public double getArea(){return 0.25*Math.sqrt(5*(5+2*Math.sqrt(5)))*Math.pow(s, 2);}
  public double getPerimeter(){return 5*s;}
  public int getNumOfEdges(){return 5;}
  public int getNumOfCorners(){return 5;}
}