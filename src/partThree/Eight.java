package partThree;

public class Eight {

    /*
    Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
     */

    public static void main(String[] args) {

        int numberOne = 787;
        int numberTwo = 581;

        determineTheDigitsNumber(numberOne, numberTwo);
    }

    public static void determineTheDigitsNumber(int numberOne, int numberTwo){
        String lineNumberOne = String.valueOf(numberOne);
        String lineNumberTwo = String.valueOf(numberTwo);
        char[] charsOne = lineNumberOne.toCharArray();
        char[] charsTwo = lineNumberTwo.toCharArray();

        System.out.print("Числа входящие в число \"" + numberOne + "\" и \"" + numberTwo + ": ");
        int count = 0;

        for(int i = 0; i < charsOne.length; i++) {
            for (int j = 0; j < charsTwo.length; j++) {
                int digitsNumberOne = Character.getNumericValue(charsOne[i]);
                int digitsNumberTwo = Character.getNumericValue(charsTwo[j]);

                if(digitsNumberOne == digitsNumberTwo) {
                    System.out.print(digitsNumberTwo + "; ");
                    count++;
                }
            }
        }
        if(count == 0) {
            System.out.println("\nНет чисел, которые бы входили в эти два числа...");
        }
    }
}
