import java.util.Arrays;
public class Merge {

    public static void mergeSort(String[] words, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(words, left, mid);
            mergeSort(words, mid + 1, right);

            merge(words, left, mid, right);
        }
    }

    public static void merge(String[] words, int left, int mid, int right) {
        int a1 = mid - left + 1;
        int a2 = right - mid;

        String[] leftWords = new String[a1];
        String[] rightWords = new String[a2];

        for (int i = 0; i < a1; ++i) {
            leftWords[i] = words[left + i];
        }
        for (int j = 0; j < a2; ++j) {
            rightWords[j] = words[mid + 1 + j];
        }

        int i = 0, j = 0;
        int s = left;

        while (i < a1 && j < a2) {
            if (leftWords[i].length() <= rightWords[j].length()) {
                words[s] = leftWords[i];
                i++;
            } else {
                words[s] = rightWords[j];
                j++;
            }
            s++;
        }

        while (i < a1) {
            words[s] = leftWords[i];
            i++;
            s++;
        }

        while (j < a2) {
            words[s] = rightWords[j];
            j++;
            s++;
        }
    }

    public static void printArray(String[] words) {
        for (String t : words) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] words = {"cat", "orange", "elephant", "bird"};
        System.out.println("До сортировки: ");
        printArray(words);
        mergeSort(words, 0, words.length - 1);
        System.out.println("После сортировки: ");
        printArray(words);
    }
}