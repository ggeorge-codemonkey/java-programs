import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStreams1 {
    public static void main(String[] args) {
        int[] arr1 = {1,5,2,7,8,4};
        Arrays.stream(arr1).forEach(System.out::println);
        Arrays.stream(arr1).sorted().forEach(System.out::println);

         List<String> strList = new ArrayList<>();
        strList.add("gogi");
        strList.add("dave");
        strList.add("mark");
        strList.add("sen");
        strList.add("matt");

        List<String> strList1 = strList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(strList1);

         Map<String, Integer> userMap = new HashMap<>();
        userMap.put("gogi", 45);
        userMap.put("dave", 40);
        userMap.put("mark", 30);
        userMap.put("matt", 28);
        userMap.put("dan", 46);
        userMap.put("stella", 35);
        userMap.put("cat", 30);


        Map<Object, Object> myMap = userMap.entrySet().stream().filter(entry -> entry.getKey().equals("dave")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(myMap);

       Set<String> hSet = new HashSet<>();
       hSet.addAll(strList);

        // hSet.add(1);
        // hSet.add(3);
        // hSet.add(2);
        // hSet.add(5);
        // hSet.add(7);
        // hSet.add(8);
        // hSet.add(9);

        hSet.stream().forEach(System.out::println);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("gogi", 50, 2000));
        employees.add(new Employee("mark", 40, 5000));
        employees.add(new Employee("dave", 30, 1000));
        employees.add(new Employee("steve", 70, 2000));
        employees.add(new Employee("dan", 25, 2000));
        employees.add(new Employee("stella", 35, 5000));

        employees.stream().collect(Collectors.groupingBy(Employee::getSalary))
        .forEach((salary, employeesList) -> {
            employeesList.forEach(emp -> System.out.println(emp.toString()));
        } );

   
    }
}
