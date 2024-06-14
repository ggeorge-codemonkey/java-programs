public class Palindrome {
    public static void main(String[] args) {
        //palindrome number reads the same both the direction

        int input = 1234322;

        boolean result = isPalindrome(input);
        System.out.println("result   "+ result);
    }

    public static boolean isPalindrome(int input){
       long reversed = 0;
       long temp = input;

        if(temp <0){
            return false;
        }


        while(temp != 0){
            int digit = (int)(temp % 10);
            reversed = reversed*10 + digit;
            temp = temp/10;    
        }

       return (reversed == input);
    }
}
