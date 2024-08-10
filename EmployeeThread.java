public class EmployeeThread implements Runnable{

    private Integer id;
    public EmployeeThread(Integer id){
        this.id = id;
    }
    public void printId(Integer i){
        System.out.println("**i**"+i);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Inside the EmployeeThread");
        
        printId(id);
       
    }

    public static void main(String[] args) {
         
        for(int i=0; i<10; i++){
            EmployeeThread et = new EmployeeThread(i);
            Thread th = new Thread(et);
            th.start();
            th.sleep(1000);