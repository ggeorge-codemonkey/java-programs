import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        List<String> ls = new ArrayList<>();
        Arrays.sort(strs);

        int strLength = 0;
        if(strs[0].length() > strs[strs.length -1].length()){
            strLength = strs[0].length();
        }else{
            strLength = strs[strs.length -1].length();
        }

        StringBuffer sb = new StringBuffer();
        while (strLength>=0) {
            
            if(strs[0] != strs[strs.length -1]){
                break;
            }else{
                sb.append(strs[0]);
            }
            strLength --;
        }
       
        System.out.println(sb.toString());
    }
}
