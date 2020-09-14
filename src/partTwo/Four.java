package partTwo;

public class Four {

    /*
        Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
   Определить, пройдет ли кирпич через отверстие.
     */

    public static void main(String[] args) {

        int length = 11; // А
        int width = 50; // А
        int lengthBrick = 25;
        int widhtBrick = 11;
        int heightBrick = 15;

        if((length >= lengthBrick || length >= widhtBrick || length >= heightBrick)&(width >= lengthBrick
                || width >= widhtBrick || width >= heightBrick)) {
            System.out.println("Кирпич проходит");
        }else System.out.println("Кирпич не проходит");
    }
}
