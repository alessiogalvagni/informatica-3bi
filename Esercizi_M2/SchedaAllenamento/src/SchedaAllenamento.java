import java.util.Scanner;

public class SchedaAllenamento {
    public static void main(String[] args) throws Exception {
        
        Scanner tastiera = new Scanner(System.in);

        final double calorie = 1.036;

        double distanza;
        System.out.println("Quanti kilometri hai percorso? ");
        distanza = tastiera.nextDouble();

        int tempo;
        System.out.println("Quanti minuti ci hai messo? ");
        tempo = tastiera.nextInt();

        int peso;
        System.out.println("Quanti chili pesi? ");
        peso = tastiera.nextInt();

        double velocitaMedia = ((distanza * 1000.0) / (tempo * 60.0)) * 3.6;
        double minutiKm = tempo / distanza;
        double calorietot = peso * distanza * calorie;

        System.out.printf("Distanza percorsa: %.2f km\n", distanza);
        System.out.printf("Tempo percorso: %d minuti\n", tempo);
        System.out.printf("Velocità media: %.2f km/h\n", velocitaMedia);
        System.out.printf("Passo: %.2f minuti al chilometro\n", minutiKm);
        System.out.printf("Calorie consumate: %.2f\n", calorietot);

    }
}
