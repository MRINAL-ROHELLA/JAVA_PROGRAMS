import java.util.Scanner;

public class areacircle {
        public static void main(String[] args)throws Exception{
        Scanner scann= new Scanner(System.in);
        System.out.print("ENTER RADIUS: ");
        int radius=scann.nextInt();
        double area = 3.14*radius*radius;
        System.out.println("area of circle: "+area);
        scann.close();
    }
    
}
