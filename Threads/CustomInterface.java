public class CustomInterface {
    public static void main(String[] args) {
        int a =100;
        int b=200;
        CustomFunctionalInterface addition = (c, d) -> c+d;

        applyOPeration(a, b, addition);
    }

    private static int applyOPeration(int a, int b, CustomFunctionalInterface operation){

        System.out.println(operation.apply(a, b));
        return operation.apply(a, b);
    }


}
