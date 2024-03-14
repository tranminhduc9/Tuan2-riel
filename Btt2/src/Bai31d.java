import java.util.Scanner;
public class Bai31d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibn = 0;
        int fibn1= 1;
        int fibn2= 1;

        if(n ==1 || n==2){
            System.out.print(1);
        }
        else{
            for(int i=2;i<n; i++){
                fibn = fibn1 + fibn2;
                fibn1= fibn2;
                fibn2= fibn;
            }
            System.out.print(fibn);
        }
    }
}
