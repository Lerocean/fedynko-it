import java.util.Arrays;

public class Fruits {
    public static void quickSort(String[] fru, int low, int high) {
        if (low < high) {
            int j = partition(fru, low, high);

            quickSort(fru, low, j - 1);
            quickSort(fru, j + 1, high);
        }
    }

    public static int partition(String[] fru, int low, int high) {
        String pivot = fru[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (fru[j].compareTo(pivot) < 0) {
                i++;

                String t = fru[i];
                fru[i] = fru[j];
                fru[j] = t;
            }
        }

        String t = fru[i + 1];
        fru[i + 1] = fru[high];
        fru[high] = t;

        return i + 1;
    }
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "grape", "banana"};

        quickSort(fruits, 0, fruits.length - 1);

        System.out.println(Arrays.toString(fruits));
    }
}