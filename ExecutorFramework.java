import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {
    public static void main(String[] args) {
        
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(Main::execute);
    }
}
