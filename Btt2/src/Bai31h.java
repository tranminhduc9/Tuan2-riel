import java.util.Scanner;
public class Bai31h{
    public static double calCos(double x, int n){
        double cos = 1.0;
        double xn = 1.0;
        int denom = 0 ;
        for(int i=1; i<n; i++){
            xn = xn * - (x*x)/((denom+1)*(denom+2));
            cos = cos +xn;
            denom = denom +2;
        }
        return cos;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x =sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(calCos(x,n));
    }
}