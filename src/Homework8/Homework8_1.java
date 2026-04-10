package Homework8;

//Задача 1:
//Пользователь вводит набор чисел в виде одной строки с клавиатуры.
//Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
//Вывести результат на экран.
//При решении использовать коллекции.

import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

    public class Homework8_1{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите числа через запятую: ");
            String input = scanner.nextLine();

            String[] parts = input.split(",");  // разбиваем строку по резделителю - запятой, получаем массив

            Set<String> uniqueNumbers = new LinkedHashSet<>(); // создаём коллекцию

            for (String part : parts) {  // проходим по массиву, который получили после split

                String cleanNumber = part.trim();  // метод trim() удаляет пробелы в начале и конце строки

                uniqueNumbers.add(cleanNumber); // метод add() добавляет элемент в Set, а если элемент уже есть, Set его проигнорирует
            }

            System.out.println("Результат: " + uniqueNumbers); // выводим результат
        }
    }
