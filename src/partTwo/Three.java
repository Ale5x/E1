package partTwo;

public class Three {

    /*
    Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
     */

    public static void main(String[] args) {

        int xA = 5; // А
        int yA = 6; // А
        int xB = 5; // В
        int yB = 3; // В
        int xC = 2; // С
        int yC = 1; // С

        if(xA == xB & xA == xC & xB == xC || yA == yB & yA == yC & yB == yC){
            System.out.println("Точки А, В и С - находятся на одной линии");
        }else if(xA == xB  || yA == yB ){
            System.out.println("Точки А и В - находятся на одной линии");
        }else if(xA == xC || yA == yC){
            System.out.println("Точки А и С - находятся на одной линии");
        }else if(xB == xC || yB == yC){
            System.out.println("Точки В, С - находятся на одной линии");
        }else System.out.println("Точки А, В, С - не находятся на одной линии");

    }
}
