import java.util.Scanner;
public class evenodd{
    public static void main(String[] args)throws Exception{
        Scanner scann= new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER: ");
        int num=scann.nextInt();
        System.out.println(num%2==0 ? "EVEN NUMBER" : "ODD NUMBER");
        scann.close();
    }
}