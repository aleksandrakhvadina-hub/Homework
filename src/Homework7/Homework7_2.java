package Homework7;

//Задача 2:
//Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины

import java.util.Scanner;

public class Homework7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи первую строку: ");  // print вместо println чтоб не переносить строку
        String s1 = scanner.nextLine();  // всё введенное сохранится в переменную s1
        System.out.print("Введи вторую строку: ");
        String s2 = scanner.nextLine();
        System.out.print("Введи третью строку: ");
        String s3 = scanner.nextLine();

        if (s1.length() > s2.length()) {  // если s1 длиннее s2
            String temp = s1; // нам понадобится временная переменная, которая сохранит текущую s1
            s1 = s2;          // в s1 запишется более короткая s2
            s2 = temp;        // в s2 вернётся длинная строка из temp
        }

        if (s2.length() > s3.length()) {  // если s2 длиннее s3, то тоже меняем их местами
            String temp = s2;
            s2 = s3;
            s3 = temp;
        }

        if (s1.length() > s2.length()) {  // после предыдущего шага порядок строк мог измениться, поэтому снова сравниваем s1 и s2
            String temp = s1;  // и меняем их местами при необходимости
            s1 = s2;
            s2 = temp;
        }

        System.out.println("Строки по возрастанию длины:");
        System.out.println("1. " + s1 + " (длина: " + s1.length() + ")");
        System.out.println("2. " + s2 + " (длина: " + s2.length() + ")");
        System.out.println("3. " + s3 + " (длина: " + s3.length() + ")");
    }
}
