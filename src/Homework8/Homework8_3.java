package Homework8;

//Задача 3:
//На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная строка является ключом,
//и ее значение равно true, если эта строка встречается в массиве 2 или более раз.
//Пример:
//wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
//wordMultiple(["c", "c", "c", "c"])→{"c": true}

import java.util.Map;
import java.util.HashMap;

public class Homework8_3 {
    public static Map<String, Boolean> wordMultiple(String[] words) {  // принимает массив строк

        Map<String, Boolean> map = new HashMap<>();  // создаём объект HashMap


        for (String word : words) {  // проходим по каждому слову в массиве


            if (map.containsKey(word)) {  // метод containsKey(Object key) проверяет, есть ли такой ключ в Map
                // если ключ уже есть, значит, слово встречалось ранее
                map.put(word, true);  // если слово уже встречалось, меняем его значение на true
                                     // метод put добавляет или обновляет значение ключа
            }
            else {  // а если ключа нет, то это первое появление слова
                map.put(word, false);  // добавляем слово в Map и ставим false (пока не встречалось дважды)
            }
        }
        return map;  // возвращаем готовую карту
    }

    public static void main(String[] args) {

        // Ситуэйшн 1: животные, один повтор
        String[] test1 = {"собака", "кошка", "лось", "лещь", "лось"};
        System.out.println("Ситуэйшн 1:");
        System.out.println(wordMultiple(test1));

        // Ситуэйшн 2: ноль повторов
        String[] test2 = {"123", "234", "345"};
        System.out.println("Ситуэйшн 2:");
        System.out.println(wordMultiple(test2));

        // Ситуэйшн 3: сплошные повторы
        String[] test3 = {"очень сложно", "очень сложно", "очень сложно", "очень сложно"};
        System.out.println("Ситуэйшн 3:");
        System.out.println(wordMultiple(test3));
    }
}
