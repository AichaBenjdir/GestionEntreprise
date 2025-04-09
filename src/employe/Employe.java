package employe;

import personne.Personne; 

public class Employe extends Personne {
    private String poste;
    private double salaire;

    // Constructeur
    public Employe(String nom, String prenom, int age, String poste, double salaire) {
        super(nom, prenom, age);  // Appel au constructeur de la classe Personne
        this.poste = poste;
        this.salaire = salaire;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
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
        sb.append("Employe{");
        sb.append("poste=").append(poste);
        sb.append(", salaire=").append(salaire);
        sb.append('}');
        return sb.toString();
    }
}