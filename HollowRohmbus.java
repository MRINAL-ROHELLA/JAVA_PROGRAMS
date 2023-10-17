public class HollowRohmbus {
    public static void main(String[] args){
        int i,j;
        for (i=0;i<5;i++){
            for (j=0;j<i;j++){
                System.out.print(" ");
                
        }
        for(int k=0;k<5;k++){
            if(i==0 || i==4 || k==0 || k==4){
                System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
            //System.out.print(" *");
        }
        System.out.println();
       }
    }
    
}
