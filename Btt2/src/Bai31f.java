import java.util.Scanner;
public class Bai31f {
    public static double calSin(double x, int n){
        double sin = x;
        double xn = x;
        int denom = 1;
        for(int i=1; i< n; i++){
            xn = xn * -(x*x)/((denom+1)*(denom+2));
            sin = sin +xn;
            denom = denom +2;
        }
        return sin;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(calSin(x,n));
    }
}
