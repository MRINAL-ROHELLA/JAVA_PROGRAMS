import java.util.Scanner;

public class FACT{
    public static void main(String[] args){
        Scanner scann= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scann.nextInt();
        int res=1;
        for(int i=1;i<=num;i++){
            res=res*i;
        }
        System.out.println("Factorial= :"+res);
        scann.close();
    }
    
}
