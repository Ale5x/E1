package partTwo;

import java.text.DecimalFormat;

public class Five {

    /*
    Вычислить значение функции:
                           | x * x - 3 * x + 9, при x <= 3
                    F(x) = | 1 / (x * x * x + 6), при x > 3
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.#####");

        int x = 5; // А

        if(x <= 3){
            double y = (Math.pow(x, 2) - 3 * x + 9);
            System.out.println("Result = " + df.format(y));
        } else{
            double y = 1 / (Math.pow(x, 3) + 6);
            System.out.println("Result = " + df.format(y));
        }

    }
}
