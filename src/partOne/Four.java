package partOne;

public class Four {

    /*
        Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
     */

    public static void main(String[] args) {

        double number = 777.888;

        String stringNumber = String.valueOf(number);       // перевод числа в строку
        StringBuilder stringBuffer = new StringBuilder(stringNumber).reverse();
        String stringReverseNumber = stringBuffer.toString();
        System.out.println("Число - " + number + ". Реверс числа - " + stringReverseNumber);

        double numberReverse = Double.valueOf(stringReverseNumber);     // возврат строки в число...
        System.out.println("Число - " + number + ". Реверс числа - " + numberReverse);
    }
}
