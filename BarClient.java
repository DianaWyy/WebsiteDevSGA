public class BarClient {
  public static void main(String[] args) {
    Bar b1 = new Bar("dark", 6, 6);
    System.out.println("Perimeter = "+b1.getPerimeter());
    System.out.println("Area = " +b1.getArea());
    System.out.println(b1.isSquare());
    System.out.println("Details: "+b1.getDetails());
    System.out.println("Bar Cost = "+b1.calculateCost(0.5,0.3));
    System.out.println("Bar Drawing : ");
    b1.drawBar();
  }
}
