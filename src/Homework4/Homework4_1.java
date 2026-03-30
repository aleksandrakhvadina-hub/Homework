package Homework4;

//Напишите
//программу, которая создает три объекта класса CreditCard у которых заданы
//номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и
//снимите с третьей. Выведите на экран текущее состояние всех трех карточек.

public class Homework4_1 {
    public static void main(String[] args) {  //создала три объекта
        CreditCard masterCard = new CreditCard("1234", 1000);
        CreditCard visa = new CreditCard("2345", 2000);
        CreditCard mir = new CreditCard("3456", 3000);

        masterCard.addMoney(500); //положила 500 на карту1
        visa.addMoney(1500);  //положила 1500 на карту2

        mir.takeMoney(5000);  //попыталась снять с карты3 5000

        masterCard.printInfo();
        visa.printInfo();
        mir.printInfo();
        //вывела информацию обо всех картах
    }


}