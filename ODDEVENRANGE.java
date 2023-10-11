import java.util.Scanner;

public class ODDEVENRANGE {
    public static void main(String[] args){
        Scanner scam= new Scanner(System.in);
        System.out.print("enter starting of range: ");
        int start =scam.nextInt();
        System.out.print("enter ending of range: ");
        int end = scam.nextInt();
        System.out.print("EVEN Numbers are: ");
        for(int i=start;i<=end;i++){
            if(i%2==0){
               System.out.print(" "+i);           }
            }
            System.out.println();
            System.out.print("ODD Numbers are: ");
        for(int i=start;i<=end;i++){
            if(i%2!=0){
               System.out.print(" "+i);           }
            }
            scam.close();

    }
    
}
