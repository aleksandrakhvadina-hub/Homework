package Homework5;


//Задача 2:
//Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
//Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
//Создать массив из 5 разных фигур.
//Вывести на экран сумму периметра всех фигур в массиве

public class Homework5_2 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];  // 5. создаём массив из 5 фигур

        figures[0] = new Circle(8);
        figures [1] = new Circle(34);
        figures[2] = new Rectangle(10,15);
        figures[3] = new Triangle(10,3,18);
        figures[4] = new Triangle(1,2,2);  // и вот эти фигуры слева направо

        double totalPerimeter = 0;  // по условию нам нужна сумма периметров всех фигур в массиве, объявили для этого переменную

        for (Figure figure : figures) {  // цикл for-each, поочерёдно достаёт каждый объект из массива и кладёт в ссылку figure типа Figure.
            totalPerimeter += figure.getPerimeter();  // вызываем getPerimeter(), динамически определяется реальный тип объекта и вызывается правильная реализация
        }
        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);  // выводим итоговую сумму в консоль
    }
}

abstract class Figure{                        //  1. объявили абстрактный класс Фигура
    public abstract double getArea();        // абстрактный метод площади фигуры
    public abstract double getPerimeter();  //абстрактный метод периметра фигуры
}

class Circle extends Figure {  //  2. объявили класс Круг, наследник класса Фигура
    private double radius;     // с приватным полем радиус

    public Circle(double radius) {  // тут у нас конструктор
        this.radius = radius;  // this ссылается на текущий экземпляр
    }

    @Override  // нужно чтобы сообщить компилятору что метод переопределяет абстрактный метод родителя
    public double getArea() {  //  метод площади
        return Math.PI * radius * radius;  //  формулу я нагуглила)
    }

    @Override
    public double getPerimeter() {  // метод периметра
        return 2 * Math.PI * radius;  //  эту формулу я тоже нагуглила)
    }
    }

class Rectangle extends Figure {  //  3. объявили класс Прямоугольник, наследник класса Фигура
    private double width;        // приватное поле ширины
    private double height;      // приватное поле высоты

    public Rectangle(double width, double height) {  // тут у нас конструктор
        this.width = width;
        this.height = height;  // this ссылается на текущий экземпляр
    }

    @Override  // нужно чтобы сообщить компилятору что метод переопределяет абстрактный метод родителя
    public double getArea() {  // метод площади
        return width * height;  //  формулу я нагуглила)
    }

    @Override  // нужно чтобы сообщить компилятору что метод переопределяет абстрактный метод родителя
    public double getPerimeter() {  // метод периметра
        return 2 * (width + height);  //  эту формулу я тоже нагуглила)
    }
}

class Triangle extends Figure {  //  4. объявили класс Треугольник, наследник класса Фигура
    private double a;  //  приватное поле первой стороны
    private double b;  //  приватное поле второй стороны
    private double c;  //  приватное поле третьей стороны

    public Triangle(double a, double b, double c) {  // конструктор
        this.a = a;
        this.b = b;
        this.c = c;  // this ссылается на текущий экземпляр
    }

    @Override  // нужно чтобы сообщить компилятору что метод переопределяет абстрактный метод родителя
    public double getArea() {  // метод площади
        double p = (a + b + c) / 2.0;  // тут вот формула для полупериметра, я очень плоха в геометрии
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));  // формула Герона блин
    }

    @Override  // нужно чтобы сообщить компилятору что метод переопределяет абстрактный метод родителя
    public double getPerimeter() {  // метод периметра
        return a + b + c;  //сумма трёх сторон
    }
}

