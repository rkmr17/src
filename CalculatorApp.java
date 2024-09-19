import  java.util.Scanner;

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
    Scanner scanner = new Scanner(System.in);
    System.out.println("test");

    //計算メソッド動作テスト
    double num1 = 10;
    double num2 = 5;

    System.out.println("加算：" + add     (num1, num2));
    System.out.println("減算：" + subtract(num1, num2));
    System.out.println("乗算：" + multiply(num1, num2));
    System.out.println("除算：" + divide  (num1, num2));
    
    num2 = 0;
    System.out.println("除算：" + divide  (num1, num2));
  }

}