import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int in = obj.nextInt();

    for (int i = in; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
