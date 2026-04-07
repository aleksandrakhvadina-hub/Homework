package Homework6;

//Создать класс с как минимум 4 разными методами, в каждом методе добавить проверку на исключительные ситуации, используя:
//1. try- catch
//2. try-catch, где catch будет несколько
//3. try -catch, с использованием multi - catch
//4. try-catch-finally
//Продемонстрировать обработку исключительных ситуаций на примерах

public class Homework6_1 {

    public void method1_simpleTryCatch() {  // метод 1 - простой try-catch


        try {  // блок с кодом, который может вызвать ошибку
            int result = 10 / 0;  // например деление на ноль

            System.out.println("Результат: " + result);  // эта строка не выполнится, потому что выше уже случилась ошибка

        } catch (ArithmeticException e) {  // блок с кодом, который сработает если в try произошла ошибка указанного типа
            System.out.println("Метод 1: Нельзя делить на ноль!");  // вместо падения программы выводится понятное сообщение (обработка исключения)
        }
    }
    // (String input) - метод принимает один параметр: строку, которую ввёл пользователь
    public void method2_multipleCatches(String input) {  // метод 2 - несколько catch блоков
        try {
            int number = Integer.parseInt(input);  // при попытке превратить строку в число вылетит NumberFormatException

            int result = 100 / number;  // при попытке поделить на число, если это число = 0 вылетит ArithmeticException

            System.out.println("Результат: " + result);

        } catch (NumberFormatException e) {  // здесь ловим ошибку преобразования строки в число
            System.out.println("Метод 2: Введено не число!");

        } catch (ArithmeticException e) {  // здесь ловим ошибку деление на ноль
            System.out.println("Метод 2: Деление на ноль!");
        }
    }


    // (int[] arr, int index) - метод принимает массив целых чисел и индекс (позицию)
    public void method3_multiCatch(int[] arr, int index) {  // метод 3 - multi-catch
        try {
            // при попытке взять элемент по индексу, если index=10, а в массиве 3 элемента, получаем
            // ArrayIndexOutOfBoundsException
            int value = arr[index];

            // при делении 10 на полученное выше значение, если оно = 0, получаем ArithmeticException
            int result = 10 / value;

            System.out.println("Результат: " + result);

            // в этом методе ловим 2 разных типа исключений в одном блоке
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            // e.getClass().getSimpleName() - достаем имя класса ошибки из объекта e и выводим его
            System.out.println("Метод 3: Ошибка: " + e.getClass().getSimpleName());
        }
    }


    public void method4_withFinally() {  // метод 4 - try-catch-finally
        try {
            System.out.println("Метод 4: пытаемся выполнить код...");

            // тут мы создаём ссылку на строку, но не создаём объект (null)
            String str = null;

            // а здесь пытаемся узнать длину строки
            System.out.println(str.length());

            // ловим ошибку обращения к null-объекту
        } catch (NullPointerException e) {
            System.out.println("Метод 4: объект был null!");

            // finally - блок "в любом случае", выполняется всегда: была ошибка или нет
        } finally {
            System.out.println("Метод 4: finally выполняется всегда!");
        }
    }

    public static void main(String[] args) {

        // создаём экземпляр (объект) нашего класса, чтобы вызвать методы
        Homework6_1 demo = new Homework6_1();

        // 1. метод 1
        System.out.println("Запуск метода 1");
        demo.method1_simpleTryCatch();

        // 2. метод 2 с "abc" - сработает первый catch
        System.out.println("Запуск метода 2");
        demo.method2_multipleCatches("abc");

        // 3. метод 2 с "0" - сработает второй catch
        System.out.println("Запуск метода 3 (деление на ноль)");
        demo.method2_multipleCatches("0");

        // 4. метод 3 с некорректным индексом (10) - ArrayIndexOutOfBoundsException
        System.out.println("Запуск метода 3 (выход за границы массива)");
        demo.method3_multiCatch(new int[]{1, 2, 3}, 10);

        // 5. метод 3 с "0" в массиве - ArithmeticException
        System.out.println("Запуск метода 3 (деление на ноль в массиве)");
        demo.method3_multiCatch(new int[]{1, 0, 3}, 1);

        // 6. метод 4 - покажет работу finally
        System.out.println("Запуск метода 4");
        demo.method4_withFinally();
    }
}  // было жесть сложно 🫠
