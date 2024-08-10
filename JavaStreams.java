import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreams {
    public static void main(String[] args) {
        int[] nums = {1,2,5,4,8,7,6,9};
      //  Arrays.stream(nums).sorted(Comparator.reverseOrder()).forEach(System.out::println);

      //find the biggest number
       int result = Arrays.stream(nums).filter(num -> num>7).findFirst().getAsInt();
       System.out.println("result" +result);

        String[] strs = {"one","three", "two", "five","seven", "eight", "nine"};
        Arrays.stream(strs).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        boolean reString =  Arrays.stream(strs).allMatch(str -> str.equals("one"));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("gogi", 50, 2000));
        employees.add(new Employee("mark", 40, 5000));
        employees.add(new Employee("dave", 30, 1000));
        employees.add(new Employee("steve", 70, 2000));
        employees.add(new Employee("dan", 25, 2000));
        employees.add(new Employee("stella", 35, 5000));

        //find employee with salary of 2000

        Map<Double, List<Employee>> employeesBySalary = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
        employeesBySalary.forEach((salary, employeeList) -> {
            System.out.println("salary   "+salary);
            employeeList.forEach(employee -> System.out.println(employee.toString()));

        });
        


    }
}
