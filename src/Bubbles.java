import java.util.*;

public class Bubbles {

    public static void main(String[] args) {
        Students[] students = {new Students("Иванов", 4.5), new Students("Козлов", 5.0),
                new Students("Петров", 3.7),
                new Students("Сидоров", 4.2),
                new Students("Смирнов", 3.9)};
        for (int a = 0; a < students.length; a++) {
            for (int b = a; b < students.length - 1; b++) {
                if (students[b].point < students[b + 1].point) {
                    var c = students[b];
                    students[b] = students[b + 1];
                    students[b + 1] = c;
                    System.out.println(Arrays.toString(students));
                }
            }
        }
    }
}
