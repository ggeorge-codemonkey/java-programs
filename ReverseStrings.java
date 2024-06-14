public class ReverseStrings {
    public static void main(String[] args) {
        String s = "the sky is blue";

        String[] sArray = s.split(" ");
        String[] result = new String[sArray.length];
        int j = sArray.length;
        j = j=1;
        System.out.println(j);
        for (int i=0; i<sArray.length; i++){
            System.out.println("result[3]" + sArray[i]);
            result[j-1] = sArray[i];
            j--;
        }
        for(String str: result){
            System.out.println(str);
        }
        
    }
    
}
