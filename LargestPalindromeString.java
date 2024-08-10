public class LargestPalindromeString {

    public static void main(String[] args) {
        String str = "abaabbaa";
        String maxStr = getLargestPalindromeString(str);
        System.out.println(maxStr);

        
    }

    public static String getLargestPalindromeString(String str){

        //1.iterate over the string
        //2. iterate over each substring 
        //3. check each substring for palindrome.
        int maxLen = 1;
        String maxStr = str.substring(0,1);
        for(int i=0; i<str.length(); i++){
            for(int j =i+ maxLen; j <= str.length(); j++){
                if(j-i > maxLen && isPalindrome(str.substring(i,j))){
                    maxLen = j - 1;
                    maxStr =  str.substring(i, j);
                }
            }
        }
        return maxStr;
    
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() -1;
        
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }


        return true;
    }
}
