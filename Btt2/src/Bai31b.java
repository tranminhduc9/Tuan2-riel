import java.util.Scanner;
public class Bai31b {
    public static boolean isPerfect(int n){
        int check = 0;
        for (int i = 1 ; i < n ; i++ ){
            if(n%i==0){
                check += i;
            }
        }
        if(check == n){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n));
    }
}
