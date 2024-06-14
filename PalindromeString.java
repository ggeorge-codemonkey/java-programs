public class PalindromeString {
    public static void main(String[] args) {
        
        String str = "abcdedcba";

        boolean result = isPalindrome(str);
        System.out.println("result   "+result);

    }
    public static boolean isPalindrome(String str){

            for(int i =0, j=str.length()-1; i<str.length(); i++,j--){

            
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            if(i == j){
                return true;
            }
        }

        return true;

    }
}
