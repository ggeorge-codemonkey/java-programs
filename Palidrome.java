public class Palidrome {
    public static void main(String[] args) {
        //find if a string is palindrome
        //find the largest palidrome substring
        String str = "aacjhg";
        // System.out.println("********************");
        // boolean isPalindrome = isPalindrome(str);
        // System.out.println("isPalindrome***"+isPalindrome);

        int maxLength = 1;
        for(int i =0; i< str.length() -1; i++){
            for(int j=i+1; j<str.length() -1; j++){
                if(isPalindrome(str.substring(i,j)) && Math.abs(i - j)>maxLength){
                    maxLength =  Math.abs(i - j);
                }
            }
        }

        System.out.println("maxLength****" +maxLength);

    }



    public static boolean isPalindrome(String str){

       int left = 0;
       int right = str.length() -1;
       while(left <= right){
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        left++;
        right--;
        
       }
       return true;
    }
}
