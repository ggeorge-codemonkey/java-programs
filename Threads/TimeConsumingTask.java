import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TimeConsumingTask implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("starting TimeConsumingTask");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("done TimeConsumingTask");
        return "TimeConsumingTask I am done";
    }
    
}
