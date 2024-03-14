import java.util.Scanner;
public class Bai31c {
    public static boolean isPrime(int n){
        for(int i =2; i<= Math.sqrt(n); i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        
        for(int i =2; i< Integer.MAX_VALUE; i++){
                if(isPrime(i)){
                    System.out.print(i+ " ");
                    a++;
                    if(a == n){
                        break;
                    }
                }
        }
}
}
