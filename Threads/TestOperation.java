public class TestOperation {
    public static void main(String[] args) {
        
        OperationInterface sum = (a, b) -> a+b;

        OperationInterface multiplication = (a, b) -> a*b;

        int result = sum.operation(10, 20);
        int result1 = multiplication.operation(10, 20);

        System.out.println(result);
        System.out.println(result1);

    }
    
}
