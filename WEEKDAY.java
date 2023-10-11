import java.util.Scanner;

public class WEEKDAY {
    public static void main(String[] ags){
        Scanner Scam = new Scanner(System.in);
        System.out.print("ENTER THE DAY: ");
        String Day = Scam.nextLine();
        switch(Day){
            case "MONDAY":
            System.out.println("It's A WEEKDAY!!!");
            break;
            case "TUESDAY":
            System.out.println("It's A WEEKDAY!!!");
            break;
            case "WEDNESDAY":
            System.out.println("It's A WEEKDAY!!!");
            break;
            case "THURSDAY":
            System.out.println("It's A WEEKDAY!!!");
            break;
            case "FRIDAY":
            System.out.println("It's A WEEKDAY!!!");
            break;
            case "SATURDAY":
            System.out.println("It's A WEEKEND!!!");
            break;
            case "SUNDAY":
            System.out.println("It's A WEEKEND!!!");
            break;
            default:
            System.out.println("INVALID!!");
            break;

        }
Scam.close();

    }
    
}
