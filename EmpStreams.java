import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EmpStreams {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("gogi");
        strList.add("dave");
        strList.add("mark");
        strList.add("sen");
        strList.add("matt");

        Optional name = strList.stream().sorted().filter(str -> str.equals("gogi")).findFirst();
        System.out.println(name.get());

        Map<String, Integer> userMap = new HashMap<>();
        userMap.put("gogi", 45);
        userMap.put("dave", 40);
        userMap.put("mark", 30);
        userMap.put("matt", 28);
        userMap.put("dan", 46);
        userMap.put("stella", 35);
        userMap.put("cat", 30);

        //find the list of users with age over 30

        List<String> userList = userMap.values().stream().filter(entry -> entry.)



    }
}
