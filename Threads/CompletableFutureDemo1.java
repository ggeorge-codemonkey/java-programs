import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFutureDemo1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(new Supplier<Integer>() {

            @Override
            public Integer get() {
                System.out.println("inside completableFuture start ");
                try{
                    TimeUnit.SECONDS.sleep(1);
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
                return 200;
            }
            
        });

        CompletableFuture<Integer> future2 = future1.thenApply(result ->{
            if(result>100){
                result = result +20;
            }

            return result;
        });
      //  System.out.println("future2 ****" + future2.get());

        future2.complete(300);
        
        System.out.println("future3 ***"+ future2.get());

    }

}
