import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String [] words = {"flower", "flash","flop"};
        Arrays.sort(words);
        for(String s: words){
            System.out.println(s);
        }
        System.out.println(words);
        String first = words[0];
        String last = words[words.length -1];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return sb;
            }else{
                sb.append(first.charAt(i));
            }
        }
    }
}
