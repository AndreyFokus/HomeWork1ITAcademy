package Task7;

public class FindWordsWithA {

    public static void main(String[] args) {
        String str = "вывфывыф а вфывфыв";

        String[] words = str.split(" ");

        boolean hasWordThatBeginsAndEndsWithA = false;
        for (String word : words) {
            if (word.startsWith("а") && word.endsWith("а") && word.length() > 1) {
                hasWordThatBeginsAndEndsWithA = true;
                break;
            }
        }

        if (hasWordThatBeginsAndEndsWithA) {
            System.out.println("В этой строке есть слова которое начинается и заканчивается на А");
        } else {
            System.out.println("В этой строке нету слов которые начинается и заканчивается на А");
        }
    }
}