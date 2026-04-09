package Homework7;

//Задача 5:
//Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
// Например, "Hello" -> "HHeelllloo"

import java.util.Scanner;

public class Homework7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи строку: ");
        String original = scanner.nextLine();

        StringBuilder builder = new StringBuilder();  // класс для сборки строк, пустой, изменяемый

        for (int i = 0; i < original.length(); i++) {  // запускаем цикл for, который пройдёт
            // по всем символам строки original
            // начиная с первого символа, пока i меньше длины строки, переходя к следующему символу

            char letter = original.charAt(i);  // берём символ из строки original с позиции 'i'

            // метод append() "приклеивает" символ в конец builder-а
            builder.append(letter); // приклеили letter первый раз
            builder.append(letter); // приклеили letter ещё раз
        }
        // дальше цикл перейдёт к следующей букве, и так далее

        String result = builder.toString();  // преобразуем StringBuilder обратно в обычный String

        System.out.println("Результат: " + result);
    }
}


