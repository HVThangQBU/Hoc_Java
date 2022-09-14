import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Liet_ke_SNT {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vap so n: ");
        int n = scanner.nextInt();
//        if( n == 2){
//            System.out.println(n);
//        }
        for (int i = 2; i < n; i++) {
            if (snt(i)) {
                System.out.print(i);
            }
        }
    }
    public static boolean snt(int n){
        if( n < 2) {
            return false;
        }
        for (int i = 2; i <= (int)sqrt(n); i++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }
}
