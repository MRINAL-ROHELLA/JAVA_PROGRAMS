import java.util.Scanner;

public class ReverseNum {
    public static void main(String args[]){  
  int r,sum=0,temp;      
  Scanner scann= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scann.nextInt();
        scann.close();
  temp=num;    
  while(num!=0){    
   r=num%10;  //getting remainder  
   sum=(sum*10)+r;    
   num=num/10;    
  }   
  System.out.println("Reverse of "+temp+" is "+sum); 
}
