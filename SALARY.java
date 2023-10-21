import java.util.Scanner;

public class SALARY {
    public static float HRA(float basic){
        float hra = (30/100)*basic;
        return hra;
    }
    public static float DA(float basic){
        float da = (20/100)*basic;
        return da;
    }
    public static float TA(float basic){
        float ta = 2000;
        return ta;
    }
    public static float GROSS(float basic){
        float gross = basic + HRA(basic)+ DA(basic)+ TA(basic);
        return gross;
    }
    public static float TAX(float basic){
        float tax=0;
        if(basic <= 10000){
            tax =  basic*(5/100);
        }
        else if(basic >10000 && basic<=50000){
            tax=basic*(10/100);
        }
        else{
            tax = basic*(20/100);
        }
        return tax;
    }
    public static void main(String[] args){
        Scanner scann= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Name = scann.nextLine();
        System.out.println("Enter basic salary: ");
        float salary = scann.nextFloat();
        double NET = GROSS(salary) - TAX(salary);
        System.out.println("your name : "+Name);
        System.out.println("YOUR salary = "+NET);
        scann.close();


    }
}
