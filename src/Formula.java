import java.util.ArrayList;
import java.util.List;
public class Formula {
    public static void selectionSort(List<String> formulas) {
        int n = formulas.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            String minFormula = formulas.get(i);

            for (int j = i + 1; j < n; j++) {
                if (getComplexity(formulas.get(j)) < getComplexity(minFormula)) {
                    minIndex = j;
                    minFormula = formulas.get(j);
                }
            }

            if (minIndex != i) {
                formulas.set(minIndex, formulas.get(i));
                formulas.set(i, minFormula);
            }
        }
    }

    public static int getComplexity(String formula) {
        int complexity = 0;
        for (char c : formula.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                complexity++;
            }
        }
        return complexity;
    }
    public static void main(String[] args) {
        List<String> formulas = new ArrayList<>();
        formulas.add("3 + 10 + 7 = 20");
        formulas.add("1 + 1 = 2");
        formulas.add("8 * (8 - 4) * 2 = 64");
        formulas.add("5 * 5 - 3");
        formulas.add("(78 - 46) / (5 + 3) * 3 = 12");

        System.out.println("Список формул до сортировки:");
        for (String formula : formulas) {
            System.out.println(formula);
        }
        selectionSort(formulas);
        System.out.println("\nСписок формул после сортировки:");
        for (String formula : formulas) {
            System.out.println(formula);
        }
    }
}
