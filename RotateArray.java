public class RotateArray {
    public static void main(String[] args) {
        //1. reverses the entire array.  {7,6,5,4,3,2,1}
        //2. reverses first k elements , move first k elements to the end of the array {5,6,7,4,3,2,1}
        //3. reverses the remaining elements restoring the order {5,6,7,1,2,3,4}

        int[] nums = {1,2,3,4,5,6,7};  
        int k =3;
                     
        reverse(nums, 0, nums.length-1);
        System.out.println("********");
        System.out.println("nums"+nums.toString());
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        for(int a : nums){
            System.out.println(a);
        }
    }
    
    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
