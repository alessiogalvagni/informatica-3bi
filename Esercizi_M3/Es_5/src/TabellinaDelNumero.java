import java.util.Scanner;

public class TabellinaDelNumero {
    public static void main(String[] args) throws Exception {
        
        Scanner tastiera = new Scanner(System.in);

        int numero;
        System.out.println("Inserire il numero: ");
        numero = tastiera.nextInt();

        int moltiplicatore = 1;
        int risultato = numero * moltiplicatore;

        while (risultato == numero*10) {
            
            System.out.println(numero +"X"+ moltiplicatore +"="+ risultato);
            moltiplicatore = moltiplicatore + 1;
            risultato = numero * moltiplicatore;
        }
    }
}
