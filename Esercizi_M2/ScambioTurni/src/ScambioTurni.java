public class ScambioTurni {
    public static void main(String[] args) throws Exception {
        
        int[] turno1 = {1};
        int[] turno2 = {2};
        int[] turno3 = {3};

        String[] studente1 = {"Alice"};
        String[] studente2 = {"Bob"};
        String[] studente3 = {"Charlie"};

        System.out.println(studente1[0] + " ha il turno " + turno1[0]);
        System.out.println(studente2[0] + " ha il turno " + turno2[0]);
        System.out.println(studente3[0] + " ha il turno " + turno3[0]);


        int[]turno0 = {};
        turno0 = turno1;
        turno1 = turno2;
        turno2 = turno3;
        turno3 = turno0;

        System.out.println("Dopo lo scambio dei turni:");
        System.out.println(studente1[0] + " ha il turno " + turno1[0]);
        System.out.println(studente2[0] + " ha il turno " + turno2[0]);
        System.out.println(studente3[0] + " ha il turno " + turno3[0]);

        
    }
}