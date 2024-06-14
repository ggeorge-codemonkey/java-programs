import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("gogi");
        names.add("Josh");
        names.add("Jewel");
        names.stream().filter(grou)
        Optional<String> = names.stream().findFirst("gogi");

        Consumer<String> method = (n) -> System.out.println(n);
        names.forEach(method);

    }
}
