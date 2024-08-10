public class ArrayDecreasingOrder {
    public static void main(String[] args) {
        int[] arr1 = {9,8,7,6,5,4};
//check if array is sorted in decreasing order
        boolean isDecreasingOder = isDecreasingOder(arr1);
        System.out.println(isDecreasingOder);
    }

    private static boolean isDecreasingOder(int[] arr1){

        for(int i=0; i< arr1.length-1; i++){
            if(arr1[i] < arr1[i+1]){
                return false;
            }
           
        }
        return true;
    }
}
