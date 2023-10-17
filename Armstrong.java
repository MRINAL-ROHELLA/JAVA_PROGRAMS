import java.util.Scanner;

class Armstrong{  
    public static void main(String args[]){  
     int r,rem=0,temp;    
     //int n=123;//It is the number variable to be checked for palindrome  
     Scanner scann= new Scanner(System.in);
        System.out.println("Enter 6 digit Account num: ");
        int n = scann.nextInt();
     temp=n;    
     while(n>0){    
      r=n%10;  //getting remainder 16
      n=n/10; 
      rem=rem+(r*r*r);        
     }    
     if(temp==rem)    
      System.out.println("armstrong number ");    
     else    
      System.out.println("not armstrong");
   }
   }