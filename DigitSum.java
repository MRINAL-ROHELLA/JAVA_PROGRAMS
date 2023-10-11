import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args){
        Scanner scam = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scam.nextInt();
        int sum=0;
        int rem;
        while(num!=0){
            rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
        scam.close();
    }
    
}
