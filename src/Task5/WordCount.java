package Task5;

public class WordCount {
    public static void main(String[] args) {
        String str = "Ссслова сссслова";

        int count = countWordsWithLetter(str, 'с', 3);
        System.out.println("Количество слов с буквой 'с' 3 и более раза: " + count);
    }

    public static int countWordsWithLetter(String str, char letter, int minCount) {
        String[] words = str.split("\\s+");

        int count = 0;
        for (String word : words) {
            int letterCount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(letter)) {
                    letterCount++;
                }
            }
            if (letterCount >= minCount) {
                count++;
            }
        }

        return count;
    }
}