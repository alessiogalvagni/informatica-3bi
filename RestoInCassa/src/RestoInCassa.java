public class RestoInCassa {
    public static void main(String[] args) throws Exception {
        

        double prezzoCent = 1780;
        double pagamentoCent = 5000;
        double restoCent = (pagamentoCent - prezzoCent);

        System.out.printf("Banconote da 50€: %d\n", (int)(restoCent / 5000));
        restoCent = restoCent % 5000;

        System.out.printf("Banconote da 20€: %d\n", (int)(restoCent / 2000));
        restoCent = restoCent % 2000;

        System.out.printf("Banconote da 10€: %d\n", (int)(restoCent / 1000));
        restoCent = restoCent % 1000;

        System.out.printf("Banconote da 5€: %d\n", (int)(restoCent / 500));
        restoCent = restoCent % 500;

        System.out.printf("Monete da 2€: %d\n", (int)(restoCent / 200));
        restoCent = restoCent % 200;

        System.out.printf("Monete da 1€: %d\n", (int)(restoCent / 100));
        restoCent = restoCent % 100;

        System.out.printf("Monete da 50cent: %d\n", (int)(restoCent / 50));
        restoCent = restoCent % 50;

        System.out.printf("Monete da 20cent: %d\n", (int)(restoCent / 20));
        restoCent = restoCent % 20;

        System.out.printf("Monete da 10cent: %d\n", (int)(restoCent / 10));
        restoCent = restoCent % 10;

        System.out.printf("Monete da 5cent: %d\n", (int)(restoCent / 5));
        restoCent = restoCent % 5;
    }
}
