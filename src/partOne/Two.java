package partOne;

import java.text.DecimalFormat;

public class Two {

    /*
    Вычислить значение выражения по формуле (все переменные принимают действительные значения)
                                               ________________
                                        b + \/b * b + 4 * a * c                      -2
                                        ------------------------  - a * a * a * c + b
                                                2 * a
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.###");       // урезает десятичные знаки, до нужного числа

        int a = 2;
        int b = 5;
        int c = 8;

        double result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * c)) - (Math.pow(a, 3) * c + Math.pow(b, -2));

        System.out.println("Result - " + df.format(result));
    }
}
