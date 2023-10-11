import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args){
        int i,j,temp;
        Scanner scam= new Scanner(System.in);
        System.out.print("enter starting of range: ");
        int start =scam.nextInt();
        System.out.print("enter ending of range: ");
        int end = scam.nextInt();
        System.out.println("prime number between "+start+" and "+end+" are: ");
        for (i=start;i<= end;i++)
        {
            if(i==1||i==0){ continue;}
            temp=1;
            for(j=2;j<=i/2;j++){
                if(i%j==0){
                    temp=0;
                    break;
                }
            }
            if(temp==1){
                System.out.print(" "+i);
            }
        }scam.close();
        }
}
