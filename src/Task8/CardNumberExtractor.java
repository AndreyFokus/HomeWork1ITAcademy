package Task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardNumberExtractor {
    public static void main(String[] args) {
        String input = "вывфывфывфы4678431324132 1234-5678-9012-3456. Ывывывффвфы45465";

        Pattern pattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{4}-\\d{4}\\b");

        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String cardNumber = matcher.group();
            System.out.println("Номер карты: " + cardNumber);
        } else {
            System.out.println("Номер карты не найден.");
        }
    }
}
