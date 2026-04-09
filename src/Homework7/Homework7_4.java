package Homework7;

// Задача 4:
// Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
// Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Homework7_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи первую строку: ");  // print вместо println чтоб не переносить строку
        String s1 = scanner.nextLine();  // всё введенное сохранится в переменную s1
        System.out.print("Введи вторую строку: ");
        String s2 = scanner.nextLine();
        System.out.print("Введи третью строку: ");
        String s3 = scanner.nextLine();

        String firstUniqueWord = null; // первое подходящее слово null - пока не нашли
        boolean found = false;         // true как только найдём первое слово


        String[] lines = {s1, s2, s3}; // собрали строки в массив, чтобы не писать три раза одинаковый код проверки

        for (String line : lines) {  // внешний цикл работает со строками
            String[] words = line.split(" ");  // split(" ") порежет строку на массив слов по пробелам

            for (String word : words) {  // внутренний цикл работает со словами
                if (word.isEmpty()) continue;  // если между словами было два пробела, split создаст пустую строку и нам надо пропустить её

                boolean isUnique = true;  // пока допустим, что в слове все символы разные

                for (int i = 0; i < word.length(); i++) {  // проходим по каждому символу слова
                    // начинаем с 0, пока i меньше длины слова, переходя к следующему символу
                    char currentChar = word.charAt(i); // объявляем переменную и помещаем в неё символ на позиции i

                    if (word.indexOf(currentChar, i + 1) != -1) {  // берём текущую букву и просим
                        // проверить есть ли такая же буква в слове после текущей
                        isUnique = false; // нашли повторяющуюся букву (неуникальную)
                        break;            // дальше это слово проверять нет смысла, оно нам уже не подходит
                    }
                }
                // а если после проверки всех символов значение останется true, то слово подходит
                if (isUnique) {
                    firstUniqueWord = word; // запоминаем первое найденное
                    found = true;         // ставим метку "нашли"
                    break;             // выходим из цикла слов
                }
            }
            // если слово уже нашли во внутреннем цикле, выходим и из внешнего цикла
            if (found) break;
        }
        // выводим результат
        if (found) {
            System.out.println("Первое слово с уникальными символами: \"" + firstUniqueWord + "\"");
        } else {
            System.out.println("Слов, состоящих только из различных символов, не найдено.");
        }
    }
}

// 💀💀💀