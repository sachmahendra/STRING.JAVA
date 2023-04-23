
class Solution {
    static String revStr(String S) {
        // code here
        int n = S.length();
        String str="";
        char ch;
        for(int i=n-1; i>=0 ; i--){
            ch= S.charAt(i);
            str=str+ch;
        }
        return str;
    }
    public static void main(String[] args){
        String S= "geekforgeeks";
        System.out.println(revStr(S));
    }
}