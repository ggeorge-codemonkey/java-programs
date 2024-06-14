import java.util.Arrays;

public class RemoveDuplicatesArray {
    
    public static void main(String[] args) {
        
        //remove duplicate elements in the array

        int[] nums = {2,3,4,2,6,7,8,3,4,2,3,1};
        Arrays.sort(nums);

       int[] newnums = new int[10];
       int pointer = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
               newnums[pointer] = nums[i];
               pointer++;
            }
        }
        for(int i: newnums){
          System.out.println(i);
         }
      
    }
}
