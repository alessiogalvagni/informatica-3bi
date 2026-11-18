import java.util.Scanner;

public class SchedaPostazione {
    public static void main(String[] args) throws Exception {
        
        Scanner tastiera = new Scanner(System.in);

        double temperatura1, temperatura2;

        System.out.println("Inserisci il primo valore: ");
        temperatura1 = tastiera.nextDouble();

        System.out.println("Inserisci il secondo valore: ");
        temperatura2 = tastiera.nextDouble();

        double differenza = temperatura2 - temperatura1;
        double media = (temperatura1 + temperatura2) / 2;
        boolean primamagg = temperatura1 > temperatura2;
        boolean tempuguali = temperatura1 == temperatura2;
        boolean tempdiverse = temperatura1 != temperatura2;
        boolean primamagg25 = temperatura1 > 25;
        boolean secondamin26 = temperatura2 <= 25;

        System.out.printf("Prima lettura: %.2f gradi\n", temperatura1);
        System.out.printf("Seconda lettura: %.2f gradi\n", temperatura2);
        System.out.printf("Variazione: %.2f gradi\n", differenza);
        System.out.printf("Media delle due letture: %.2f gradi\n", media);
        System.out.printf("La prima è maggiore della seconda: %b\n", primamagg);
        System.out.printf("Le due letture sono uguali: %b\n", tempuguali);
        System.out.printf("Le due letture sono diverse: %b\n", tempdiverse);
        System.out.printf("La prima supera i 25 gradi: %b\n", primamagg25);
        System.out.printf("La seconda resta entro i 25 gradi: %b\n", secondamin26);

    }
}
