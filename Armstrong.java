class Armstrong{  
    public static void main(String args[]){  
     int r,rem=0,temp;    
     int n=123;//It is the number variable to be checked for palindrome  
     
     temp=n;    
     while(n>0){    
      r=n%10;  //getting remainder 
      n=n/10; 
      rem=rem+(r*r*r);        
     }    
     if(temp==rem)    
      System.out.println("armstrong number ");    
     else    
      System.out.println("not armstrong");
   }
   }