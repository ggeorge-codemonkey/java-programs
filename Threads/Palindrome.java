public class Palindrome {
    //find the longest palindrome substring

   

   public static void main(String[] args) {
    String str = "madam";
    boolean result = isPalindrome(str);
    System.out.println(result);

   }

   private static boolean isPalindrome(String str){

    int left = 0;
    int right = str.length() -1;
    for(int i=0; i< (str.length() -1); i++){
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
    }
    return true;
   }
}
