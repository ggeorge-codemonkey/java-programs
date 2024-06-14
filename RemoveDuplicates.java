public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(nums.length);
        int[] newnums = new int[10];
        int j = 1;
        for(int i=1; i<nums.length; i++ ){
            System.out.println(i);
            if(nums[i] != nums[i-1]){
                newnums[j] = nums[i];
                j++;
            }
            
        }
        System.out.println("j"+j);
        for(int k : newnums){
            System.out.println("result"+k);
        }
       
    }
}
