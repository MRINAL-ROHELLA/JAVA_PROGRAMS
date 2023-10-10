import java.util.Scanner;

public class count {
    public static void main(String[] args){
        Scanner scann= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scann.nextInt();
        int count=0;
        while(num!=0){
            num=num/10;
            count=count+1;
        }
        System.out.println("no of digits is: "+count);
        scann.close();
        
    }
    
}
