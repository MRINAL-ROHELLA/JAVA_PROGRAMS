public class HollowTriangle {
    public static void main(String[] args) {
        int i,j;
        for (i=0;i<=5;i++){
            for (j=0;j<=i;j++){
                for(i=1;i<4;i++)
                {
                    for(j=2;j<i;j++)
                    {
                        System.out.print("-");
                    }
                }
                System.out.print(" *");
             }
             System.out.println();
            }
            
        }
}       

