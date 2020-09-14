package partThree;

public class Four {

    /*
    Составить программу нахождения произведения квадратов первых двухсот чисел
     */

    public static void main(String[] args) {

        long big = 0;

        for(int i = 0; i <= 200; i++) {
            big += Math.pow(i, 2);
        }

        System.out.println("Result pow first 200 numbers equals - " + big);
    }
}

