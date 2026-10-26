public class PrezzoConIva {
    public static void main(String[] args) throws Exception {
        
        double prezzo;
        prezzo = 100.0;
        System.out.println("Prezzo = " + prezzo);

        double iva;
        iva = prezzo * 22 / 100;
        System.out.println("IVA = " + iva);

        double prezzoConIva;
        prezzoConIva = prezzo + (prezzo * iva / 100);
        System.out.println("Prezzo con IVA = " + prezzoConIva);
    }
}
