import java.util.Scanner;

public class EsitoCorsaCampestre {
    public static void main(String[] args) throws Exception {
        
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserire il tempo in secondi della corsa: ");
        int tempo = tastiera.nextInt();

        if (tempo < 0) {
            System.out.println("Errore: la soglia di tempo deve essere maggiore di 0");
        
        } else {
        }

        if (tempo >= 900){
            System.out.println("Esito: qualificato alla fase provinciale");
        }


        System.out.println("Rilevazione terminata.");

    }
}
