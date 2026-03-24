package Homework2;

//Задача 4:
//Необходимо, чтоб программа выводила на экран вот такую последовательность:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.

public class Homework2_4 {
    public static void main(String[] args) {

        int a = 7;

        while (a <= 98) {
            System.out.print(a + " "); //print а не println чтобы числа вывелись в одну строку
            a = a + 7;
        }
    }
}
