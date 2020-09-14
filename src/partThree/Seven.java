package partThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seven {

    /*
        Для каждого натурального числа в промежутке от mдо n вывести все делители,
    кроме единицы и самого числа. mи n вводятся с клавиатуры.
     */

    public static void main(String[] args) {

        Scanner inReader = new Scanner(System.in);

        try {
        System.out.print("Введите первое число - ");
        int numberOne = inReader.nextInt();

        System.out.print("Введите второе число - ");
        int numberTwo = inReader.nextInt();

        if(numberOne < numberTwo){
            for(int i = numberOne; i <= numberTwo; i++){
                System.out.print("Делители числа - " + i + " | " );
                for(int j = 2; j < 10; j++) {
                    if(i % j == 0) {
                        System.out.print(j + " | ");
                    }
                }
                System.out.println();
            }
        }else if(numberOne > numberTwo){
            for(int i = numberTwo; i <= numberOne; i++){
                System.out.print("Делители числа - " + i + " | " );
                for(int j = 2; j < 10; j++) {
                    if(i % j == 0) {
                        System.out.print(j + " | ");
                    }
                }
                System.out.println();
            }
        }else System.out.println("Введен малый числовой промежуток!");
        }catch (InputMismatchException e) {
            System.out.println("Введён неверный формат...");
        }
    }
}
