import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Set;

public class DuplicateWords {
    public static void main(String[] args) {
        //find duplicate words in  a string

        String s = " this is my world but  not  dream world";

        String [] words = s.split(" ");


      Set<String> duplicates = Arrays.asList(words).stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());

            duplicates.forEach(name -> System.out.println(name));

            Set<String> duplicates1 = Arrays.asList(words).stream()
             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
             .entrySet().stream()
             .filter(entry -> entry.getValue() >1)
             .map(Map.Entry::getKey)
             .collect(Collectors.toSet());


             Map<String, Integer> wordCount = new HashMap<>();

             for(String word : words){
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
             }

            //  List<String> l1 = wordCount.entrySet().stream().filter(w -> w.getValue()>1).toList();
            //  System.out.println(wordCount);

             for(Map.Entry<String, Integer> entry: wordCount.entrySet()){
                if(entry.getValue()>1){
                    System.out.println(entry.getKey());
                }

             }
    }
}
