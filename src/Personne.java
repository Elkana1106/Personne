public class Personne {
    // Déclaration des compteurs
    public static int nbInstances;
    public int nbLocal;

    public Personne(){

        nbInstances++;

        nbLocal++;

    }

    public static void main(String[] args) {
        Personne personne1 = new Personne();

        Personne personne2 = new Personne();

        Personne personne3 = new Personne();

        Personne personne4 = new Personne();
    }


}
