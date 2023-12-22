
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Personne {
    private String nom;
    private String prenom;
    private String matricule;
    private Date dateNaissance;

    public Personne() {
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dateNaissance);
    }

    public String getMatricule() {
        char Lnom = nom.charAt(0);
        char Lpnom = prenom.charAt(0);
        Random random = new Random();
        int numMat = random.nextInt(10000);
        return String.format("%c%c%d", Lpnom, Lnom, numMat);
    }
}
