package lesson12;

import java.io.*;
import java.util.Scanner;

public class FileCopyPaste {
    public static void copyFile(File from, File to) throws Exception {
        try (FileInputStream in = new FileInputStream(from);
             FileOutputStream out = new FileOutputStream(to)) {
            int x;
            while ((x = in.read()) != -1) {
                out.write(x);
            }
            System.out.println("Скопировано");
        }
        catch (IOException e) {
        System.out.println("Ошибка при копировании файла: " + e.getMessage());
    }
}

    public static void main(String[] args) throws Exception {
        Scanner text = new Scanner(System.in);
        System.out.println("Копируем из:");
        String from = text.nextLine();
        File a = new File(from);
        System.out.println("Вставляем в:");
        String to = text.nextLine();
        File b = new File(to);
        copyFile(a, b);
        text.close();
    }
}
