package massive;

import java.util.*;
public class DeleteDoubles {
    public static void removeEven(LinkedList<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        removeEven(list);
        System.out.println(list);
    }
}