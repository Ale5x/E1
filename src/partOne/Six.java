package partOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Six {

    /*
        Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    принадлежит закрашенной области, и false — в противном случае:

                                                ----|----
                                                |   |   |
                                      false     |   |   |   false
                                                |   |   |
                                        ________|_______|__________
                                              |     |      |
                                       false  |true | true |  false
                                              |_____|______|
                                                    |
                                                    |


     */

    public static void main(String[] args) {

        Scanner inReader = new Scanner(System.in);

        try {
        System.out.print("Enter coordinates x: ");
        double x = inReader.nextDouble();

        System.out.print("Enter coordinates y: ");
        double y = inReader.nextDouble();

        System.out.println();

        if(x >= -4 & x <= 4 & y >= -3 & y <= 4){
            System.out.println("True");
        } else System.out.println("False");
        }catch (InputMismatchException e) {
            System.out.println("Введён неверный формат...");
        }
    }
}
