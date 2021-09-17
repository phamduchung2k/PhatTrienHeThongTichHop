import java.util.Scanner;

public class Diem { // khởi tạo biễn x, y
 
     static int x; 
     static int y;
   
    // public Diem() {     // gán toạ dộ cho 1 điểm
    //     this.x = x;
    //     this.y = y;
    // }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void nhapToaDo(){  // hàm nhập giá trị 
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap toa do x: ");
        x = sc.nextInt();
        System.out.println("nhap toa do y: ");
        y = sc.nextInt();
    }

    public static void inToaDo () {
        System.out.println("toado" + "(" + x + "," + y + ")" );
           
    }

    public static void tinhKhoangCach(){
        double a = Math.sqrt(x * x + y * y);
        System.out.println("khoang cach den goc toa do la:" + a);
    }

    public static void main(String[] args) {
        Diem a = new Diem();
        a.nhapToaDo();
        a.inToaDo();
        a.tinhKhoangCach();

    }
  } 