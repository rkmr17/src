import java.util.Scanner;

public class CalculatorApp {
  // 加算メソッド
  public static double add(double a, double b) {
    return a + b;
  }

  // 減算メソッド
  public static double subtract(double a, double b) {
    return a - b;
  }

  // 乗算メソッド
  public static double multiply(double a, double b) {
    return a * b;
  }

  // 除算メソッド
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

    // ユーザー入力処理
    System.out.println("一つ目の数字を入力してください");
    double num1 = scanner.nextDouble();

    System.out.println("演算子を入力してください");
    String operator = scanner.next();

    System.out.println("二つ目の数字を入力してください");
    double num2 = scanner.nextDouble();

    // 入力された演算子別に対応したメソッドを呼び出す
    double result = 0;
    switch (operator) {
      case "+":
        result = add(num1, num2);
        break;
      case "-":
        result = subtract(num1, num2);
      case "*":
        result = multiply(num1, num2);
      case "/":
        result = divide(num1, num2);
      default:
        System.out.println("無効な演算子です");
        break;
    }

    //計算結果を出力
    System.out.println("結果：" + result);


  }

}