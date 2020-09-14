package partTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {

    /*
        Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
    то будет ли он прямоугольным.
     */

    public static void main(String[] args) {

        Scanner inReader = new Scanner(System.in);

        try {
            System.out.print("Enter first angle in degrees: ");
            int firstAngle = inReader.nextInt();

            System.out.print("Enter second angle in degrees: ");
            int secondAngle = inReader.nextInt();

            defineTriangle(firstAngle, secondAngle);
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат...");
        }
    }

    public static void defineTriangle(int firstAngle, int secondAngle) {
        int sumAngle = firstAngle + secondAngle;
        if (sumAngle <= 180) {
            System.out.println("Triangle exists");    //   Треугольник существует
            if (firstAngle == 90 || secondAngle == 90 || (180 - sumAngle) == 90) {
                System.out.println("");
                System.out.println("The triangle is rectangular");   //    Треугольник прямоугольный
            }
        }
    }
}
