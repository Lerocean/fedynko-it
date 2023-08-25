package sort;
import java.util.Arrays;

public class Insert {
    public static int countVowels(String t) {
        int count = 0;
        for (int i = 0; i < t.length(); i++) {

            if ((t.charAt(i) == 'a') || (t.charAt(i) == 'e') || (t.charAt(i) == 'i') || (t.charAt(i) == 'o') || (t.charAt(i) == 'u')) {
                count++;
            }

        }
        return count;
    }
    public static void insertionSort(String[] words) {
        int j;
        for (int i = 1; i < words.length; i++) {
            String swap = words[i];

            for (j = i; j > 0 && countVowels(swap) < countVowels(words[j - 1]); j--) {
                words[j] = words[j - 1];
            }
            words[j] = swap;
        }
    }
    public static void main(String[] args) {
        String[] words = {"cat", "orange", "elephant", "bird"};
        System.out.println(Arrays.toString(words));
        System.out.println("_____________________");
        insertionSort(words);
        System.out.println(Arrays.toString(words));
    }
}
