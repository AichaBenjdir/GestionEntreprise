
import java.util.ArrayList;
import java.util.List;

public class Directeur extends Personne {
    private double salaire;
    private List<Employe> employes;


    // Constructeur
    public Directeur(String nom, String prenom, int age, double salaire) {
        super(nom, prenom, age);  // Appel au constructeur de la classe Personne
        this.salaire = salaire;
          this.employes = new ArrayList<>();  // Initialisation de la liste des employés

    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

// Méthode pour ajouter un employé
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    // Méthode pour afficher les employés
    public void afficherEmployes() {
        System.out.println("Employés du directeur " + getNom() + " :");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Directeur{");
        sb.append("salaire=").append(salaire);
        sb.append('}');
        return sb.toString();
    }
}