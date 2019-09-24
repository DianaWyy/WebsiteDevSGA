public class MyCalculator{
  public static void main(String[] args)
  {
    int myInt= Integer.parseInt(args[0]);
    System.out.println("The number is "+myInt);
    System.out.println("The result is "+ myInt/2);
    System.out.println("The double is "+(double) myInt);
  }
}
