import java.util.Scanner;
public class Bai32g {
    public static double cal(double x){
        double sum = x;
        double temp= x;
        int i = 2;
        do{
            temp *= - (x/i);
            sum += temp;
            i++;
        }while(Math.abs(temp) >= 1e-6);
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x =sc.nextDouble();
        System.out.printf("%.6f",cal(x));
        
    }
}
