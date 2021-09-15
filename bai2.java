import java.util.Scanner;

public class bai2 {
    public static boolean isPrime(int n) {
      if (n <= 1) {
        return false;
      }
      for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("nhap vao so nguyen n = ");
      int n = sc.nextInt();
  
      if (isPrime(n)) {
        System.out.println(n + " la so nguyen to!");
      } else {
        System.out.println(n + " khong la so nguyen to!");
      }
  
      sc.close();
    }
  }