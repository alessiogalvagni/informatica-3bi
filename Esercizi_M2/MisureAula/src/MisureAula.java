public class MisureAula {
    public static void main(String[] args) throws Exception {

        double lunghezza = 10.0;
        double larghezza = 8.0;
        double altezza = 3.0;

        double volume = lunghezza * larghezza * altezza;
        double superficie = lunghezza * larghezza;
        double perimetro = 2 * (lunghezza + larghezza);
        double persone = superficie / 1.8; 

        System.out.println("Volume dell'aula: " + volume +" m³");
        System.out.println("Superficie dell'aula: " + superficie +" m²");
        System.out.println("Perimetro dell'aula: " + perimetro +" m");
        System.out.println("Numero di persone che possono stare nell'aula: " + persone);

    }
}
