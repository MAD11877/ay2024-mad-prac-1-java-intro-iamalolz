import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int in = obj.nextInt();
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < in; i++) {
      int in2 = obj.nextInt();
      list.add(in2);
    }

    int maxFrequency = 0;
    int mode = 0;

    for (Integer num : list) {
      int frequency = Collections.frequency(list, num);
      if (frequency > maxFrequency) {
        maxFrequency = frequency;
        mode = num;
      }
    }

    System.out.println(mode);
  }
}