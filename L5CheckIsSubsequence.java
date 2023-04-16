public class L5CheckIsSubsequence {
    static boolean isSubSequence(String s1, String s2, int n, int m){
        if(n<m) return false;
        int j=0;
        for(int i=0; i<n && j<m; i++){
            if(s1.charAt(i)==s2.charAt(j))
            j++;
        }
      return (j==m);
    }
    public static void main(String[] args) {
        String s1= "ABCDE";
        String  s2 = "ADE";
        int n=5; int m= 3;
        System.out.println(isSubSequence(s1, s2,n,m));
    }
}
