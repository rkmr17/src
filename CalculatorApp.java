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

  // 数字入力メソッド
  public static double getInput(Scanner scanner, String prompt) {
    double num = 0;
    boolean keepInput = false;
    System.out.println(prompt);
    while (!keepInput) {
      try {
        num = scanner.nextDouble();
        keepInput = true;
      } catch (Exception e) {
        System.out.println("無効な入力です再度入力してください。");
        scanner.next();
      }
    }
    return num;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean keepRanning = true;
    System.out.println("電卓アプリケーション");

    // 任意のタイミングまでループする
    while (keepRanning) {
      // ユーザー入力処理
      double num1 = getInput(scanner, "一つ目の数字を入力してください");

      System.out.println("演算子を入力してください");
      String operator = scanner.next();

      double num2 = getInput(scanner, "二つ目の数字を入力してください");

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

      // 計算結果を出力
      System.out.println("結果：" + result);

      // ループを継続させるか選択する
      System.out.println("続けて計算しますか？（y/n）");
      boolean keepChoice = true;
      while (keepChoice) {
        String choice = scanner.next();
        switch (choice) {
          case "y":
            keepChoice = false;
            break;
          case "n":
            keepRanning = false;
            keepChoice = false;
            break;
          default:
            System.out.println("yかnを入力してください");
            break;
        }
      }
    }

  }

}