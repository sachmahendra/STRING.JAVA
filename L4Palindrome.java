/* 
public class L4Palindrome {
    static boolean isPalindrome(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome(str));
    }
}
*/

//efficient method

public class L4Palindrome {
    static boolean isPalindrome(String str){

        int begin = 0;
        int end= str.length()-1;
        while(begin < end){
            if(str.charAt(begin) != str.charAt(end))
            return false;

            else{
            begin ++;
            end--;
        }
        }
        return true;
    }
        public static void main(String[] args) {
            String str= "ABCDBA";
            System.out.println(isPalindrome(str));

        }
    }