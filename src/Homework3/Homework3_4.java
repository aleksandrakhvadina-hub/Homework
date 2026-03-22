package Homework3;

//пользователь с клавиатуры
//вводит размер массива (просто целое число). После того, как размер массива
//задан, заполнить его одним из двух способов: используя Math.random(), или
//каждый элемент массива вводится пользователем вручную. Попробовать оба
//варианта. После заполнения массива данными, решить для него следующие
//Задача 4:
//Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
//вывести сообщение, что их нет.

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Homework3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введи размер массива (целое число):");
        int size = scanner.nextInt();  //считали число с клавы и сохранили в переменную size

        while (size <= 0) {  //проверка что число больше 0
            System.out.println("Таких массивов не бывает! Введи число больше 0:");
            size = scanner.nextInt();
        }
        int[] arr = new int[size];  //массив целых чисел размером size

        System.out.println("Заполнение: 1 - случайно, 2 - вручную");
        int choice = scanner.nextInt();  //что было выбрано

        for (int i = 0; i < size; i++) {  //цикл для заполнения массива
            if (choice == 1) {  //если выбрали случайно
                arr[i] = random.nextInt(100);  //генерируем случайное число от 0 до 99
            } else {  //иначе (если не случайно, то вручную)
                System.out.println("Введите число для ячейки " + i);  //просьба ввести число для ячейки
                arr[i] = scanner.nextInt();  //считываем число и записываем в ячейку массива
            }
        }

        System.out.println("Массив: " + Arrays.toString(arr));

        int zeroCount = 0;  //счётчик нулей

        for (int i = 0; i < size; i++) {  //цикл который проходит по всем элементам массива, начиная с первого,
                                         //идём до конца массива, переходим к след.элементу
            if (arr[i] == 0) {
                zeroCount = zeroCount + 1;  //если нашли ноль - увеличиваем счётчик нулей на единицу
            }
        }

        if (zeroCount > 0) {  //если нули есть - выводим их количество
            System.out.println("Количество нулевых элементов: " + zeroCount);
        } else {  //если нулей нет - такое сообщение
            System.out.println("Нулевых элементов нет");
        }
    }
}