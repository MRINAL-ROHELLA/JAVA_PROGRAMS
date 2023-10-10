import java.util.Scanner;

public class CALC{
    public static void main(String[] args){
        Scanner scann= new Scanner(System.in);
        System.out.println("Enter First num: ");
        int a = scann.nextInt();
        System.out.println("Enter Second num: ");
        int b = scann.nextInt();
        System.out.println("Choose option: ");
        char oper= scann.next().charAt(0);
        switch(oper){
            case '+':
            System.out.println("you choose addition");
            System.out.println("sum = " +(a+b));
            break;
            case '-':
            System.out.println("you choose subtraction");
            System.out.println("diff = "+(a-b));
            break;
            case '*':
            System.out.println("you choose multiplication");
            System.out.println("mul = " +(a*b));
            break;
            case '/':
            System.out.println("you choose division");
            System.out.println("div = "+(a/b));
            break;
            default:
            System.out.println("invalid");

        }
        scann.close();
        
    }    
}
