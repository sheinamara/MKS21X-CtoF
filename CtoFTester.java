public class CtoFTester{
  public static double celsiusToFahrenheit(double C) {
      return (9 / 5) * C + 32;
      }
  public static double fahrenheitToCelsius(double F){
      return (5 / 9) * (F - 32);
      }

  public static void main(String[] args){
      System.out.println("" + celsiusToFahrenheit(0));
      System.out.println("" + fahrenheitToCelsius(32));
    }
}
