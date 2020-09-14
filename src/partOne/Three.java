package partOne;

import java.text.DecimalFormat;

public class Three {

    /*
    Вычислить значение выражения по формуле (все переменные принимают действительные значения):
                                        sin(x) + cos(y)
                                        --------------- * tg(x * y)
                                        cos(x) - sin(y)
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.###");        // урезает десятичные знаки, до нужного числа

        int x = 7;
        int y = 3;

        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x + y);
        System.out.println("Result - " + df.format(result));
    }
}
