import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println("test ...");
        Runnable task = () -> System.out.println("Task executed by"+ Thread.currentThread().getName());   
        pool.execute(task); 
        pool.shutdown();


        ForkJoinPool pool2 = new ForkJoinPool();
        ForkJoinTask<Integer> recursiveTask = new RecursiveTask<Integer>() {

            @Override
            protected Integer compute() {
                System.out.println("Executed by"+ Thread.currentThread().getName());
                return 100;
            }
            
        };
        Integer result = pool2.invoke(recursiveTask);
        System.out.println("result **********"+result);


        ForkJoinPool pool3 = new ForkJoinPool();
        ForkJoinTask<Integer> reForkJoinTask = new RecursiveTask<Integer>() {

            @Override
            protected Integer compute() {
                return 45;
            }
            
        };

        ForkJoinTask<Integer> future = pool3.submit(reForkJoinTask);
        try {
            Integer result1 = future.get();
            System.out.println("result1 ***"+result1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
