import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        Scanner scann= new Scanner(System.in);
        System.out.println("Enter 6 digit Account num: ");
        int acc = scann.nextInt();
        int LEN = String.valueOf(acc).length();
        if(LEN==6){

            System.out.println("Choose Option\n 1. FOR BALANCE\n 2. FOR DEPOSIT\n3. FOR WITHDRAW");
            int OP = scann.nextInt();
            switch(OP){
                case 1:
                System.out.println("YOUR BALANCE IS: ");
            }

        }
        scann.close();

    }
    
}
