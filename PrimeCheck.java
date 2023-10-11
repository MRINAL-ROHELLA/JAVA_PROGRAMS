import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args){
        int j,temp=0;
        Scanner scann= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scann.nextInt();
        scann.close();
             
            for(j=2;j<=num/2;j++){
                if(num%j==0){
                    temp++;
                    break;
                }
            }
            System.out.println(temp==0?(+num+" is a prime"):(+num+" is not a prime"));            
}

}