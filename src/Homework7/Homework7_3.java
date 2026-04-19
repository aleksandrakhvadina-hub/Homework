package Homework7;

//Задача 3:
//Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, а также их длину

import java.util.Scanner;

public class Homework7_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи первую строку: ");  // print вместо println чтоб не переносить строку
        String s1 = scanner.nextLine();  // всё введенное сохранится в переменную s1
        System.out.print("Введи вторую строку: ");
        String s2 = scanner.nextLine();
        System.out.print("Введи третью строку: ");
        String s3 = scanner.nextLine();

        int totalLength = s1.length() + s2.length() + s3.length();  // сначала считаем среднюю длину строки (всё сложили и делим на 3)
        double averageLength = totalLength / 3.0;  // тут важно делить на 3.0 а не на 3, иначе дробную часть отбросит

        System.out.println("Средняя длина строк: " + averageLength);

        boolean foundShorter = false;  // это я подумала что неплохо было бы
        // при отсутствии строк короче средней выводить сообщение об этом :)

        if (s1.length() < averageLength) {  // если s1 короче средней то выводим её
            System.out.println("Меньше средней: \"" + s1 + "\" (длина: " + s1.length() + ")");
            foundShorter = true;
        }

        if (s2.length() < averageLength) {  // если s2 тоже короче средней то выводим и её
            System.out.println("Меньше средней: \"" + s2 + "\" (длина: " + s2.length() + ")");
            foundShorter = true;
        }

        if (s3.length() < averageLength) {  // если s3 тоже короче средней то и её выводим
            System.out.println("Меньше средней: \"" + s3 + "\" (длина: " + s3.length() + ")");
            foundShorter = true;
        }

        if (!foundShorter) {  // если не true
            System.out.println("Нет строк, длина которых меньше средней");
        }
    }
}
