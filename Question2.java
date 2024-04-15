import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in); 
    Double height = obj.nextDouble();
    Double weight = obj.nextDouble();
    Double bmi = weight / (height * height);
    System.out.println(bmi);
  }
}
