import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FastTask implements Callable<String>{

    @Override
    public String call() throws Exception {
       System.out.println("start FastTask");
       TimeUnit.SECONDS.sleep(1);
       System.out.println("end FastTask");
       return "FastTask ***I am done";
    }
    
    
}
