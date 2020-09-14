package partThree;

public class Two {
    /*
    Вычислить значения функции на отрезке [а,b] c шагом h:
                                | x, x > 2
                            y = | -x, x <= 2
     */

    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int step = 1;
        if(step > 2){
            System.out.println("Y equals = " + step);
        }else System.out.println("Y equals = " + (0 - step));
    }
}
