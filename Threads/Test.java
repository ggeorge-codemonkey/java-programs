import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future1 = executorService.submit(new TimeConsumingTask());
        Future<String> future2 = executorService.submit(new FastTask());
        while(!future1.isDone() && !future2.isDone()){
            System.out.println("threads are not done yet");
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println(future1.get());
        System.out.println(future2.get());
    }
}
