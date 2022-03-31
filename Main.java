import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int head;

      Scanner input = new Scanner(System.in);

      System.out.print("Sıcaklık Giriniz: ");
      head = input.nextInt();

      if ((head >= 0) && (head < 5)) {
          System.out.println("Kayak Yapabilirsiniz.");
      } else if ((head >= 5) && (head <= 25)) {
          if (head <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz.");
          } else {
              System.out.println("Pikniğe Gidebilirsiniz.");
          }
      } else {
          System.out.println("Yüzmeye Gidebilirsiniz.");
      }
    }
}
