public class Main {
    public static void main(String[] args) {

        Personne personne = new Personne();

        personne.setNom("Niang");
        personne.setPrenom("ada");

        System.out.println("Nom: " + personne.getNom());
        System.out.println("Prénom: " + personne.getPrenom());
        System.out.println("Date de naissance: " + personne.getDateNaissance());
        System.out.println("Matricule: " + personne.getMatricule());
    }
}
