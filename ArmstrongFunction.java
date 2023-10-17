import java.util.Scanner;

public class ArmstrongFunction {
    static int findLength(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
    static int findPower(int base, int exp) {
        int powerValue = 1;
        for (int i = 1; i <= exp; i++) {
            powerValue = powerValue*base;
        }
        return powerValue;
    }
    static int isArmstrong(int num){
        int n= num;
        int Numlength= findLength(n);
        int sum=0;
        while(num!=0){
            int lastDigit= num%10;
            sum=sum+findPower(lastDigit,Numlength);
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scann= new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scann.nextInt();
        int value = isArmstrong(number);
        if (number == value) {
            System.out.println("Arm");
        } else {
            System.out.println("Not Arm");
        }
        scann.close();
    }
}
