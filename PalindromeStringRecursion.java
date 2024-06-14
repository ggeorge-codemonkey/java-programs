public class PalindromeStringRecursion {
    public static void main(String[] args) {
        String str = "radarr";

        boolean result = isPalindrome(str);
        System.out.println("result  "+result);

    }

    public static boolean isPalindrome(String str){
        if(str.length() <=1){
            return true;
        }else{
           return str.charAt(0) == str.charAt(str.length()-1) && isPalindrome(str.substring(1, str.length() -1));
        }
    }
}
