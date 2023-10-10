import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        Scanner scann= new Scanner(System.in);
        System.out.println("Enter 6 digit Account num: ");
        int acc = scann.nextInt();
        int LEN = String.valueOf(acc).length();
        int amnt=0;
        int dep=0;
        int with=0;
        
        if(LEN==6){
            while(acc!=0){
            System.out.println("Choose Option\n1. FOR BALANCE\n2. FOR DEPOSIT\n3. FOR WITHDRAW\n4. FOR EXIT");
            int OP = scann.nextInt();
            switch(OP){
                case 1:
                System.out.println("YOUR BALANCE IS: "+(amnt));
                break;
                case 2:
                System.out.println("ENTER AMOUNT TO DEPOSIT: ");
                dep=scann.nextInt();
                amnt= amnt+dep;
                break;
                case 3:
                System.out.println("ENTER AMOUNT TO WITHDRAW: ");
                with=scann.nextInt();
                amnt=amnt-with;
                break;
                case 4:
                System.out.println("THANKYOU:)");
                acc=0;
                break;
                default:
                System.out.println("WRONG CHOICE!!!");
                
            }

        }}
        else{
            System.out.println("INVALID ACCOUNT NUMBER!!!");
        }
        scann.close();

    }
    
}
