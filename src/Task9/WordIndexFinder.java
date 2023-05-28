package Task9;

public class WordIndexFinder {
    public static void main(String[] args) {
        String str = "Кодовое слов 'key' ";
        String word = "key";

        int index = findWordIndex(str, word);

        if (index != -1) {
            System.out.println("Слово \"" + word + "\" найдено в строке.");
            System.out.println("Индекс первого символа: " + index);
        } else {
            System.out.println("Слово \"" + word + "\" не найдено в строке.");
        }
    }

    public static int findWordIndex(String str, String word) {
        int strLength = str.length();
        int wordLength = word.length();

        for (int i = 0; i <= strLength - wordLength; i++) {
            int j;
            for (j = 0; j < wordLength; j++) {
                if (str.charAt(i + j) != word.charAt(j)) {
                    break;
                }
            }
            if (j == wordLength) {
                return i;
            }
        }

        return -1;
    }
}

