import java.util.Scanner;

public class SogliaUmidita {
    public static void main(String[] args) throws Exception {
       
        Scanner tastiera = new Scanner(System.in);
        
        
        System.out.println("Inserisci la soglia di umidità in percentuale intera: ");
        int SogliaUmidita = tastiera.nextInt();

        if (SogliaUmidita < 0 || SogliaUmidita > 100) {
            System.out.println("Errore: la soglia di umidità deve essere compresa tra 0 e 100.");


        } else {
        }
        
        if (SogliaUmidita > 65) {
            System.out.println("ATTENZIONE: umidita' oltre il 65 per cento.\r\n" + //
                                "Aprire le finestre per dieci minuti.");
        }

        System.out.println("Umidita' registrata:: " + SogliaUmidita + "%");
        
    }
}
