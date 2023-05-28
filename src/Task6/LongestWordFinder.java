package Task6;

public class LongestWordFinder {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String sentence = "Самые длинные слова";
        String longestWord = findLongestWord(sentence);
        System.out.println("Самое длинное слово: " + longestWord);
    }
}

