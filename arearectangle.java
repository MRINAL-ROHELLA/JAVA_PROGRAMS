import java.util.Scanner;

public class arearectangle {
    public static void main(String[] args)throws Exception{
        Scanner scann= new Scanner(System.in);
        System.out.print("ENTER LENGTH: ");
        int LEN=scann.nextInt();
        System.out.print("ENTER BREADTH: ");
        
        int BRE=scann.nextInt();
        double area = LEN*BRE;
        System.out.println("area of RECTANGLE: "+area);
        scann.close();
    }
}
