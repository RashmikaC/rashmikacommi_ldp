package assignment_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String regEx="[A-Z][a-z\\s]*\\.";
        String text="Welcome to the java program.";
        Pattern pattern=Pattern.compile(regEx);
        Matcher matcher=pattern.matcher(text);
        boolean result=matcher.matches();
        System.out.println(result);
    }
}
//Time Complexity: O(n), n is length of the string
//Space Complexity: O(1)