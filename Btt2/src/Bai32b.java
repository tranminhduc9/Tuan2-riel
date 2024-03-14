import java.util.Scanner;
public class Bai32b {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i =2; i<= Math.sqrt(n); i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void countPrime(int l,int r ){
        int count =0;
        int i = l;
        do{
            if(isPrime(i)){
                count++;
            }
            i++;
        }while(i<=r);
        System.out.print(count);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        countPrime(l, r);
    }
}
