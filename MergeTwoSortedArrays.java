import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m =3;
        int n=3;

        for(int i : nums2){
            
            if(m<= nums1.length){
                nums1[m] = i;
            }
                
            m++;
        }
        Arrays.sort(nums1);
        for(int i: nums1){
            System.out.println(i);
        }

    }
}
