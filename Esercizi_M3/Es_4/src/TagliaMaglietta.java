import java.util.Scanner;

public class TagliaMaglietta {
    public static void main(String[] args) throws Exception {
        
        Scanner tastiera = new Scanner(System.in);

        int taglia;
        System.out.println("Inserire la circonferenza del torace in cm: ");
        taglia = tastiera.nextInt();

        if (taglia < 60 || taglia > 150) {

            System.out.println("Misura non valida");

        } else if (taglia <= 88) {

            System.out.println("Taglia da ordinare: S");

        } else if (taglia <= 96) {

            System.out.println("Taglia da ordinare: M");

        } else if (taglia <= 104) {

            System.out.println("Taglia da ordinare: L");

        } else if (taglia <= 112) {

            System.out.println("Taglia da ordinare: XL");

        } else {

            System.out.println("Taglia da ordinare: XXL");
            
        }
        
    }
}
