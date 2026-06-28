public class Main {
    public static void main(String[] args) {
        CompteBancaire c1 = new CompteBancaire("Manu", 1000);
        c1.deposer(500);
        c1.retirer(300);
        c1.afficher();
    }
}
