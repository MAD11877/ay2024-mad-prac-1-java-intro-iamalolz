import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in); 
    System.out.println("Enter height: ");
    Double height = obj.nextDouble();
    System.out.println("Enter weight: ");
    Double weight = obj.nextDouble();
    Double bmi = weight / (height * height);
    System.out.println(bmi);
  }
}
