package ro.fasttrackit.curs6;

import java.util.Arrays;
import java.util.Random;

public class DinoHomework {
    public static void main(String[] args) {
        int suma = sumaNumerelor(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
        System.out.println("Suma numerelor este: " + suma);
        System.out.println("--------------------------------------");
        numereleImpare(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
        System.out.println("--------------------------------------");
        maiMariDecat(new int[]{9, 14, 21, 24, 54, 60, 6, 43, 75}, 25);
        System.out.println("--------------------------------------");
        sumaDeAtins();
        System.out.println("--------------------------------------");
        numarMaximDonatii();
        System.out.println("--------------------------------------");
        frazaDespartita("Ragnar.Lothbrok.a.devenit.cel.mai.cunoscut.viking.dupa.ce.a.navigat.spre.vest .Bjorn.a.fost.primul.fiul.a.lui.Ragnar.impreuna.cu.Lagatha .Ubbe.Hvitsec.Sighed.si.Ivar.sunt.copii.lui.Ragnar.impreuna.cu.Aslaug.");

    }
    private static void frazaDespartita(String fraza) {

        String[] despartire = fraza.split(" .");
        for(int i=0; i< despartire.length;i++){
            System.out.println(despartire[i]);
        }
    }

    public static void numarMaximDonatii(){
        Random rnd = new Random();

        int donatie = rnd.nextInt(500);
        int suma = 100000;
        int nrDonatii = 30;
        int sumaTotala = 0;
        for(int i = 0; i < nrDonatii; i++){
            System.out.println("Donatia facuta este in valoare de: " + donatie);
            sumaTotala = sumaTotala + donatie;
        }
        System.out.println("Campania sa incheiat. Ati reusit sa strangeti: " + sumaTotala);
    }

    public static void sumaDeAtins() {
        Random rnd = new Random();

        int donatie = rnd.nextInt(500);
        int sumaDorita = 2000;
        int donatiiPrimite = 0;
       do {
           donatiiPrimite = donatiiPrimite + donatie;
           System.out.println("O donatie in valoare de " + donatie + " a fost facuta!");
       }while(donatiiPrimite <= sumaDorita);
        System.out.println(donatiiPrimite + " Ati ajuns la suma dorita cu succes!");
    }


    public static void maiMariDecat(int[] numere, int numarCautat) {
        int i = 0;
        for (int sir : numere) {
            if (sir >= numarCautat) {
                System.out.println(sir);
            }
        }
    }

    public static void numereleImpare(int[] numere) {
        for (int impar : numere) {
            if (impar % 2 != 0) {
                System.out.println(impar);
            }
        }
    }

    public static int sumaNumerelor(int[] numere) {
        int sum = 0;
        for (int valoare : numere) {
            sum = sum + valoare;
        }
        return sum;
    }
}
