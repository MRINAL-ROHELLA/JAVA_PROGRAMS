import java.util.Scanner;

public class SEASON {
    public static void main(String[] args){
        Scanner Scam = new Scanner(System.in);
        System.out.print("ENTER THE MONTH: ");
        String MONTH = Scam.nextLine();
        switch(MONTH){
            case "JANUARY":
            System.out.println("WINTER!!!");
            break;
            case "FEBRUARY":
            System.out.println("WINTER!!!");
            break;
            case "MARCH":
            System.out.println("SPRING!!!");
            break;
            case "APRIL":
            System.out.println("SPRING!!!");
            break;
            case "MAY":
            System.out.println("SPRING!!!");
            break;
            case "JUNE":
            System.out.println("SUMMER!!!");
            break;
            case "JULY":
            System.out.println("SUMMER!!!");
            break;
            case "AUGUST":
            System.out.println("SUMMER!!!");
            break;
            case "SEPTEMBER":
            System.out.println("FALL!!!");
            break;
            case "OCTOBER":
            System.out.println("FALL!!!");
            break;
            case "NOVEMBER":
            System.out.println("FALL!!!");
            break;
            case "DECEMBER":
            System.out.println("WINTER!!!");
            break;
            default:
            System.out.println("INVALID!!");
            break;

        }
Scam.close();
    }
    
}
