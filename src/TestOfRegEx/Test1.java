package TestOfRegEx;

public class Test1 {
    /*
            \\d  одна цифра
            \\w  одна буква

            +  1 или более
            *  0 или более
            ?  0 или 1 символ до

            (a|b|c)  одна строка из множества

            [abcdefg] = (a|b|c|d|e|f|g)
            [a-zA-Z] all english alphabet
            [0-9] all numbers = \\d
            [^abc] all char without a b c

            .  any symbol

            {2}  2 символа до
            {2,}  2 или более символа
            {2,4}  от двух до 4 символов
         */

    public static void main(String[] args) {
        String a = "-2344";
        String b = "2344";
        String c = "+2344";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "gfg21123envknvqokn323";
        System.out.println(d.matches("[a-zA-Z123]+\\d+"));

        String e = "helloc";
        System.out.println(e.matches("[^abc]*"));

        String url1 = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "hello world";

        System.out.println(url1.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));

        String f = "13";
        System.out.println(f.matches("\\d{2}"));
    }
}
