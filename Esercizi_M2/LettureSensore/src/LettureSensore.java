import java.util.Scanner;

public class LettureSensore {
    public static void main(String[] args) throws Exception {
       
        Scanner tastiera = new Scanner(System.in);

        final int spazioTot = 512;

        int postazione;
        System.out.println("Numero della postazione: ");
        postazione = tastiera.nextInt();

        int memoria;
        System.out.println("Memoria utilizzata in gigabyte: ");
        memoria = tastiera.nextInt();

        int spazio;
        System.out.println("Inserire la quantità di spazio libero: ");
        spazio = tastiera.nextInt();
        
        String nome;
        System.out.println("Inserisci il tuo nome: ");
        nome = tastiera.nextLine();

        String cognome;
        System.out.println("Inserisci il tuo cognome: ");
        cognome = tastiera.nextLine();

        String sistemaOperativo;
        System.out.println("Inserisci il tuo sisteme operativo: ");
        sistemaOperativo = tastiera.nextLine();

        System.out.println("===== SCHEDA POSTAZIONE =====");
        System.out.printf("Numero postazione: %d\n", postazione);
        System.out.printf("Studente assegnato: %s %s\n", nome, cognome);
        System.out.printf("Sistema operativo: %s\n", sistemaOperativo);
        System.out.printf("Memoria: %d GB\n", memoria);
        System.out.printf("Spazio libero: %d GB su %d GB\n", spazio, spazioTot);
        System.out.printf("Percentuale libera: %.2f%%\n", ((double)spazio / (double)spazioTot) * 100);
        System.out.println("=============================");

    }
}
