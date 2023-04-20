import java.util.*;

public class HollowSqure {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m= scn.nextInt();
        for(int i = 0; i< n;i++){
            for(int j =0; j<m;j++ ){
                if((i==0 || i== m-1 ) || (j==0 || j==n-1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
