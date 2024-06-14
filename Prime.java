public class Prime {
    public static void main(String[] args) {

        //prime number can be divided 1 and by itself
        int input = 15;
        boolean result = false;

        result = isPrime(input);
        System.out.println("is the input prime "+ result);

        
        
    }

    public static boolean isPrime(int input){

        for(int i=2; i<input; i++){
            if(input%i == 0){
                return false;
            }
        }
        return true;
    }
}
