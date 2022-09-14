import java.util.Scanner;
public class Tinh_tong_cua_s_n {
   public static void main (String[] args){
       int t,tong = 0;
       Scanner scanner = new Scanner(System.in);
       System.out.println("nhap vao so n:");
       int n = scanner.nextInt();
       while ( n > 0){
           t = n % 10;
           tong += t;
           n /= 10;
       }
       System.out.println("tong cua n: "+tong);
   }
}
