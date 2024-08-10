import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {
    public static void main(String[] args) {
        //number%10 gives the integer
        //number = number/10 gives the next integer

        int x = 23452345;

        List<Integer> l = new ArrayList();

        while(x/10 >= 0){
            int y = x%10;
            l.add(y);
            x= x/10;
        }

        System.out.println(l);
    }
}
