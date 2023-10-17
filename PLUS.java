public class PLUS {
    public static void main(String[] args){
        int i,k;
        for (i=1;i<=9;i++){
            for(k=1;k<=9;k++){
                if(i==0 || i==5 || k==0 || k==5){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
           }
        }
        
}
