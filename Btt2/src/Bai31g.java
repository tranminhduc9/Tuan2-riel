import java.util.Scanner;

public class Bai31g {
    public static double cal(double x, int n){
        double sum =1;
        double xn = 1;
        for(int i=1; i<= n;i++){
            xn = xn* x/i ;
            sum = sum + xn;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();

        System.out.print(Math.round(cal(x,n)*100.0)/100.0);
    }
}
