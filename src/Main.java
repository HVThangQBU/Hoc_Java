import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao n: ");
        int n = scanner.nextInt();
        System.out.println("cac so nguyen to nho hon n");
        for(int i = 2; i < n; i++){
            if(checksnt(i)){
                System.out.print("  "+i);
            }
        }
        int s = 0;
        while (n > 0){
            s += n % 10;
            n /=10;
        }
        System.out.println("tong"+s);

    }
    public static boolean checksnt(int n){
        if ( n < 2){
            return false;
        }
        for( int i = 2; i <= (int)sqrt(n); i ++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
}