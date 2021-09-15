import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {

        long sum = 0;
        int n;
        Scanner sc;
        do {
            System.out.println("nhap so n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("tong tu 1 den n la = " + sum);
        sc.close();
    }
}