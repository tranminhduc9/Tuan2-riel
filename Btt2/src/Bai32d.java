import java.util.Scanner;

public class Bai32d {
    public static boolean pNum(int n){
        int sum = 0;
        int temp;
        int newn =n;
        do{
            temp = n%10;
            sum += temp;
            n= n/10;
        }while(n>0);
        if(newn % sum ==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(pNum(n));
    }
}
