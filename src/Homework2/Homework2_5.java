package Homework2;

//Задача *:
//Напишите программу, где пользователь вводит любое целое положительное
//число.
//А программа суммирует все числа от 1 до введенного пользователем числа. Для
//ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
//пользователь не мог ввести некорректные данные

import java.util.Scanner;

public class Homework2_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое положительное число");
        int n = scanner.nextInt();

        while (n <= 0) { //проверка на корректность
            System.out.println("Ой! Это не целое положительное число!");
            n = scanner.nextInt(); //считываем новое число
        }

        int sum = 0; //начинаем считать от нуля

        for (int i = 1; i <= n; i++) { //проходим по всем числам до n
            sum = sum + i;
        }

        System.out.println("Сложим числа от 1 до " + n + " и получим " + sum);
    }
}
