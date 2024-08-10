import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {


        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Alice", 30);
        myMap.put("Karen", 30);
        myMap.put("Bob", 25);
        myMap.put("Charlie", 35);
        myMap.put("Dave", 20);
        myMap.put("Rob", 20);
        myMap.put("Matt", 20);
        myMap.put("Eve", 40);

        //sort the items  by value.

     Map<Integer, List<String>> salMap = myMap.entrySet().stream()
     .collect(Collectors.groupingBy(Map.Entry::getValue, 
        HashMap::new, 
        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));

       salMap.forEach((sal,names)-> {
        System.out.println(sal);
        names.forEach(name -> System.out.println(name));
       }
       );
    }
}
