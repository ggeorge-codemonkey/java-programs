public class SplitString {
    public static void main(String[] args) {
        
        String s = "Hello World";
        String [] words = s.split(" ");
        System.out.println(words.length);
        System.out.println(words[1]);
        System.out.println(words[words.length - 1]);
    }
}
