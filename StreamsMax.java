import java.util.Arrays;

public class StreamsMax {
    public static void main(String[] args) {
        
        int[] nums = {1,5,4,6,8,2,6,8,7,8};
        int maxNum = Arrays.stream(nums).max().getAsInt();
        long count = Arrays.stream(nums).filter(num -> num == maxNum).count();

        Arrays.stream(nums).distinct().forEach(System.out::println);;

        int sum = Arrays.stream(nums).reduce(0, Integer::sum);
        System.out.println("sum***"+sum);

       // System.out.println(disArr);

        System.out.println(count);
    }
}
