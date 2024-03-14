import java.util.Scanner;
public class Bai32a {
    public static int reverseNum(int n){
        int revNum = 0;
        int temp = 0;
        do{
            temp = n%10;
            revNum = temp + revNum*10; 
            n = n/10;
        }while(n>0);
        return revNum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseNum(n));
    }
}
