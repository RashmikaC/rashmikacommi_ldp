package core_java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args){
//        String regEx="\\w\\W.\\s\\d";
//        String text="a%p 8";
//        String regEx="[89][0-9]{9}";
//        String text="9988776654";
        String regEx="[a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}";
        String text="abc_456-7.8@gmail.com";
        Pattern pt=Pattern.compile(regEx);
        Matcher mt=pt.matcher(text);
        boolean result=mt.matches();
        System.out.println(result);
    }
}
//Time Complexity: O(1)
//Space Complexity: O(1)