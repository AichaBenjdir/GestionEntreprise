public class Directeur extends Personne {
    private double salaire;

    // Constructeur
    public Directeur(String nom, String prenom, int age, double salaire) {
        super(nom, prenom, age);  // Appel au constructeur de la classe Personne
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
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