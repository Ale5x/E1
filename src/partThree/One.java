package partThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {
    /*
        Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.
     */

    public static void main(String[] args) {

        Scanner inReader = new Scanner(System.in);
        try {
        System.out.print("Enter number - ");
        int number = inReader.nextInt();
        int sum = 0;

        System.out.println();
        if(number > 0){
            for(int i = 0; i <= number; i++){
                sum += i;
            }
            System.out.println("Sum numbers - " + sum);
        }else System.out.println("Enter a positive number!");
        }catch (InputMismatchException e) {
            System.out.println("Введён неверный формат...");
        }
    }
}
