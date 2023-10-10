import java.util.Scanner;
public class greater {
    public static void main(String[] args){
        System.out.println("Enter Three numbers: ");
        Scanner Sc=new Scanner(System.in);
        int n1=Sc.nextInt();
        int n2=Sc.nextInt();
        int n3=Sc.nextInt();
        System.out.println(n1>n2 ? (n1>n3 ? "n1 is greater" : "n3 is greater" ): (n2>n3 ? "n2 is greater": "n3 is greater"));
        Sc.close();
    }
    
}
