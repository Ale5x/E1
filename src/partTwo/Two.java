package partTwo;

public class Two {

    /*
    Найти max{min(a, b), min(c, d)}
     */

    public static void main(String[] args) {

        int numberA = 4;
        int numberB = 10;
        int numberC = 5;
        int numberD = 2;

        // поиск максимального числа, где из двух находим минимальный, а потом из двух минимальных
        // находим максимальное...
        System.out.println("Результат - " + Math.max(Math.min(numberA, numberB), Math.min(numberC, numberD)));
    }
}
