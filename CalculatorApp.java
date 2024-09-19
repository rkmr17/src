public class CalculatorApp {
  //加算メソッド
  public static double add(double a, double b) {
    return a + b;
  }

  //減算メソッド
  public static double subtract(double a, double b) {
    return a - b;
  }

  //乗算メソッド
  public static double multiply(double a, double b) {
    return a * b;
  }

  //除算メソッド
  public static double divide(double a, double b) {
    if (b == 0) {
      System.out.println("0では割り切れません");
      return 0;
    }
    return a / b;
  }

  public static void main(String[] args) {
    System.out.println("test");
  }

}