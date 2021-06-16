package example01;
import java.util.regex.*;
public class Find {
    public static void main(String[] args) {
        String str = "abcdefg12345";
        String regex = "[a-zA-Z]+[0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}