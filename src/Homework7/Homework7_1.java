package Homework7;

//Задача 1:
//Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
//Вывести найденные строки и их длину.

import java.util.Scanner;

public class Homework7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи первую строку: ");  // print вместо println чтоб не переносить строку
        String s1 = scanner.nextLine();  // всё введенное сохранится в переменную s1
        System.out.print("Введи вторую строку: ");
        String s2 = scanner.nextLine();
        System.out.print("Введи третью строку: ");
        String s3 = scanner.nextLine();

        String longest = s1;  // для начала назначим s1 и самой длинной, и самой короткой строкой
        String shortest = s1;

        if (s2.length() > longest.length()) {  // тут сравниваем длину s2 с текущей самой длинной строкой
            longest = s2;  // и если s2 длиннее, то она становится новой самой длинной
        }
        if (s2.length() < shortest.length()) {  //  и также сравниваем с текущей самой короткой строкой
            shortest = s2;  // и обновляем если s2 короче
        }

        if (s3.length() > longest.length()) {  // то же самое для s3
            longest = s3;
        }
        if (s3.length() < shortest.length()) {
            shortest = s3;
        }

        System.out.println("Самая длинная: \"" + longest + "\" (длина: " + longest.length() + ")");
        System.out.println("Самая короткая: \"" + shortest + "\" (длина: " + shortest.length() + ")");

    }
}
