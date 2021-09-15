import java.util.Scanner;

public class bai1 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\n chuoi can doi: ");
    message = sc.nextLine();
    System.out.println("Chuoi sau khi doi: ");
    System.out.println(message.toUpperCase()); // toUpperCase chuyển đổi chuỗi thường sang chuỗi in hoa
  }
}