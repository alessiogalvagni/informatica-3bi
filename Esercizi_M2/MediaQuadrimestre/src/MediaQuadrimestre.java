public class MediaQuadrimestre {
    public static void main(String[] args) throws Exception {
        
        int[] voto1 = {7};
        int[] voto2 = {5};
        int[] voto3 = {8};
        int[] voto4 = {6};

        double media = (voto1[0] + voto2[0] + voto3[0] + voto4[0]) / 4;

        System.out.println("Voti degli studenti: " + voto1[0] + ", " + voto2[0] + ", " + voto3[0] + ", " + voto4[0]);
        System.out.println("Media dei voti: " + media);
    }
}
