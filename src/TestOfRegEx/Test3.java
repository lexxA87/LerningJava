package TestOfRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        String text = "Hey Guys! I send you my email tommy@gmail.com so we can\n" +
                "keep it touch. Thanks, Joe! That's cool! I am sending you\n" +
                "my address: joe123@email.ru. Let's stay in touch...";
        //System.out.println(text);

        Pattern email = Pattern.compile("(\\w+)@((gmail|email|yandex)\\.(com|ru))");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(1));
        }

    }
}
