import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashSetStream {
    public static void main(String[] args) {
        Set<Integer> hSet = new HashSet<>();

        hSet.add(1);
        hSet.add(3);
        hSet.add(2);
        hSet.add(5);
        hSet.add(7);
        hSet.add(8);
        hSet.add(9);

        Set<Integer> hSet1 =  hSet.stream().sorted().collect(Collectors.toSet());
        System.out.println(hSet1);
    }
}
