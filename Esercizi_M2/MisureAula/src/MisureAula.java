public class MisureAula {
    public static void main(String[] args) throws Exception {

        double lunghezza = 8.4;
        double larghezza = 6.2;
        double altezza = 3.0;

        double volume = lunghezza * larghezza * altezza;
        double superficie = lunghezza * larghezza;
        double perimetro = 2 * (lunghezza + larghezza);
        int persone = (int) (superficie / 1.8);

        System.out.printf("Volume dell'aula: %.2f m³%n", volume);
        System.out.printf("Superficie dell'aula: %.2f%n", superficie);
        System.out.printf("Perimetro dell'aula: %.2f%n", perimetro);
        System.out.printf("Numero di persone che possono stare nell'aula: %d%n", persone);

    }
}
