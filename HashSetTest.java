import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
    
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("name1");
        l1.add("name2");
        l1.add("name3");
        l1.add("name4");



        Set<Integer> s1 = new HashSet(l1);
        System.out.println(s1.contains("name2"));

        System.out.println(s1);
    }
}
