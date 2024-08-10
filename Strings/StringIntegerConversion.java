package Strings;

public class StringIntegerConversion {
    public static void main(String[] args) {
        int x = -314;
        String convertedString = convertIntToString(x);
      //  System.out.println(convertedString);

        String s = "314";
        int y = stringToInt(s);
        System.out.println(y);
    }

    public static String convertIntToString(Integer i){
        boolean isNegative = false;
        if(i<0){
             isNegative = true;
        }

        StringBuilder sb = new StringBuilder();

        do{
            sb.append(Math.abs(i%10));
            i = i/10;

        }while(i != 0);

  
        return sb.append(isNegative ? "-" : "").reverse().toString();
    }

    public static Integer stringToInt(String s){
        boolean isNegative = s.charAt(0) == '-' ? true: false;
        String str =  "";
        if(isNegative){
            str =  s=s.substring(1,s.length());
        }
        
       
        System.out.println(isNegative);
       int y = 0;
       System.out.println("s****"+s);
        for(int i=0; i < s.length(); i++){
            y = y*10 + (s.charAt(i) - '0');
            System.out.println("y"+y);

        }

        return y;

    }
}
