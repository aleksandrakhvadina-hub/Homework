package Homework4;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.

public class CreditCard {//создала класс

    String accountNumber;
    double balance;  //и поля

    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void addMoney(double sum){  //это метод, который позволяет начислять сумму на кредитную карточку
        balance = balance + sum;  //текущий баланс + сумма к начислению = новый баланс
    }

    void takeMoney(double cashOut){  //а это метод, который позволяет снимать с карточки некоторую сумму

        if (cashOut > balance) {  //здесь нужна проверка что на балансе достаточно денег
            System.out.println("На карте " + accountNumber + " недостаточно средств для снятия. Попробуйте другую сумму");
        } else {  //а если достаточно - считаем
            balance = balance - cashOut;
        }
    }

    void printInfo () {  //и ещё метод, который выводит текущую информацию о карточке, 
                        // скобки пустые потому что метод обращается к полям объекта accountNumber и balance
        System.out.println("Номер карты: " + accountNumber);
        System.out.println("Баланс: " + balance + "руб.");
    }
}
