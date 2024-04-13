public class RemoveElementFromArray {
    
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,2,5,6,7,2,2};
        int[] result = new int[nums.length];
        int val =2;
        int index = 0;

        for(int i: nums){
            if (i != val) {
                nums[index] = i;
            }
            index++;
        }
        for(int i : nums){
            System.out.println(i);
        }

    }
}
