import java.util.Arrays;

public class L8LeftMostNonRepeating {
    static final int CHAR =256;
    static int leftNotRep(String str){
        int f1[]= new int[256];
        Arrays.fill(f1, -1);
        for(int i=0; i<str.length();i++){
            if(f1[str.charAt(i)]==-1)
            f1[str.charAt(i)]=i;
            else
            f1[str.charAt(i)] = -2;

        }
        int result=(Integer.MAX_VALUE);
        for(int i=0; i<CHAR;i++){
            if(f1[i]>=0)
            result = Math.min(result, f1[i]);
            

        }
        return(result == Integer.MAX_VALUE) ? -1 : result;
        

        

    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("element of index number "+ leftNotRep(str)+" is first non repeting char");
    }
}
