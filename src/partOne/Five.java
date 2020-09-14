package partOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Five {

    /*
            Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        Вывести данное значение длительности в часах, минутах и секундах в следующей форме:ННч ММмин SSc
     */

    public static void main(String[] args) {
        Scanner inReader = new Scanner(System.in);

        System.out.print("Enter time in seconds - ");

        try {
        int timeSeconds = inReader.nextInt();
        int hour = timeSeconds / 3600;
        int minutes = (timeSeconds - hour * 3600) / 60;
        int seconds = timeSeconds - (hour * 3600) - ( minutes * 60);

        System.out.println(hour + " - hours " + minutes + " - minutes " + seconds + " - seconds");
        }catch (InputMismatchException e) {
            System.out.println("Введён неверный формат...");
        }
    }
}
