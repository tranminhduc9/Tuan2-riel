import java.util.Scanner;
public class Bai32f {
    public static boolean superOdd(int n){
        int sum = 0;
        int temp;
        int newn =n;
        do{
            temp = newn%10;
            if(temp%2==0){
                return false;
            }
            sum += temp;
            newn= newn/10;
        }while(newn>0);
        if(sum %2 !=0 && n!= 0){
            return true;
        }
        return false;
    }
    public static void countSO(int n){
        int count =1;
        int i=0;
        do{
            if(superOdd(i)){
                count++;
                System.out.print(i+ " ");
            }
            i++;
        }while(count <= n);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countSO(n);
    }
}
