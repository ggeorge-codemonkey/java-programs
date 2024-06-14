public class Lambdas{
    public static void main(String[] args) {
       

        TestFunctionalInterface test = (s) -> System.out.println(s);
        printName(test);

        
    }

    public static void printName(TestFunctionalInterface testFunctionalInterface){
        testFunctionalInterface.printString("gogi");
    }
}
