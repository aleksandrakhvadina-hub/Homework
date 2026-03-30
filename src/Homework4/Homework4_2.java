package Homework4;

public class Homework4_2 {
    public static void main(String[] args) {
        ATM myAtm = new ATM(100, 100, 500);

        boolean result = myAtm.getMoney(10845);
        System.out.println(result);
    }
}
