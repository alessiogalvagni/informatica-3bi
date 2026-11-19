import java.util.Scanner;

public class NumeroPariDispari {
    public static void main(String[] args) throws Exception {
        
        Scanner tstiera = new Scanner(System.in);

        int numero;
        System.out.println("inserire il numero: ");
        numero = tstiera.nextInt();

        double NumeroPariDispari = numero % 2;

        double numerodiv5 = numero % 5;

        if (NumeroPariDispari == 0) {

            System.out.println("Il numero " + numero +" è pari");

        } else {

            System.out.println("Il numero " + numero +" è dispari");

        }

        if (numerodiv5 == 0) {

            System.out.println("Il numero " + numero +" è un multiplo di 5");

        } else {

            System.out.println("Il numero " + numero +" non è un multiplo di 5");
        }
    }
}
