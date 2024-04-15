import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int in = obj.nextInt();
    
    for (int i = in; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
