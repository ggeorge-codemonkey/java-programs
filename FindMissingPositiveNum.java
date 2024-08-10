import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class FindMissingPositiveNum {
    
    public static void main(String[] args) {
        int[] A = {3,1,2,5,3};
        List<String> al = new ArrayList<>();
        al.add("gogi");
        al.add("george");

        System.out.println(al.get(1));

        List<Integer> L = new LinkedList<>(Arrays.stream(A).boxed().toList());
        
        System.out.println(L);

        for(int i=0;i<L.size(); ++i){
            while(L.get(L.get(i) -1) !=(L.get(i))){
                Collections.swap(L, i, L.get(i)-1);
            }
            
        }
        System.out.println(L);

        int result = IntStream.range(0, L.size())
        .filter( i -> L.get(i) != i +1).
        findFirst().getAsInt();

        System.out.println(result);
        
    }
}
