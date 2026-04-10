package Homework8;

//Задача 2:
//Создать класс, который будет хранить в себе коллекцию с названиями животных.
//Реализовать методы удаления и добавления животных по следующим правилам:
//добавляется всегда в начало коллекции, а удаляется всегда из конца.
//Показать работу объекта этого класса в main методе другого класса.

import java.util.Scanner;

public class Homework8_2 {
    public static void main(String[] args) {

        AnimalCollection zoo = new AnimalCollection();  // создаём экземпляр класса AnimalCollection

        zoo.addAnimal("Лиса");  // добавляем в начало коллекции лису

        zoo.addAnimal("Волк");  // добавляем в начало коллекции волка, теперь он перед лисой

        zoo.addAnimal("Заяц");  // добавляем в начало коллекции зайца, перед волком и лисой

        System.out.println("Текущий список животных: " + zoo.getAnimals());  // выводим текущее состояние коллекции

        String removed = zoo.removeAnimal();  // удаляем лису

        System.out.println("Удалили: " + removed);  // выводим кого удалили
        System.out.println("Осталось: " + zoo.getAnimals());  // и кто остался

        removed = zoo.removeAnimal();  // удаляем волка

        System.out.println("Удалили: " + removed);  // выводим кого удалили
        System.out.println("Осталось: " + zoo.getAnimals());  // и кто остался

        removed = zoo.removeAnimal();  // удаляем зайца

        System.out.println("Удалили: " + removed);  // выводим кого удалили
        System.out.println("Осталось: " + zoo.getAnimals());  // и никого не осталось

        removed = zoo.removeAnimal();  // попробуем удалить из пустого списка

        if (removed == null) {  // ну и тут если null вернулся, то выведем сообщение
            System.out.println("Нечего удалять: коллекция пуста!");
        }
    }
}
