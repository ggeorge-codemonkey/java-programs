import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFutureDemo2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(new Supplier<Integer>() {

            @Override
            public Integer get() {
                TimeUnit.SECONDS.sleep(1);
                return 300;
            }
            
        }).thenCompose(result ->{
            if(result>200){
                result = result +50;
            }
            
        }).complete(400);
        
        
    }
}
