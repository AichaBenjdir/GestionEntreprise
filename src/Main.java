import personne.Personne;
import employe.Employe;
import directeur.Directeur;

public class Main {
    public static void main(String[] args) {

        // Création d'une personne
        Personne personne = new Personne("Dupont", "Jean", 45);
        System.out.println(personne);

        // Création d'un employé
        Employe employe1 = new Employe("Martin", "Alice", 30, "Développeur", 3000.00);
        System.out.println(employe1);

         // Création d'un employé
        Employe employe2 = new Employe("Lemoine", "Bob", 35, "Chef de projet", 4000.00);
        System.out.println(employe2);


        // Création d'un directeur
        Directeur directeur = new Directeur("Durand", "Pierre", 50, 5000.00);
        System.out.println(directeur);

         // Ajouter des employés au directeur
        directeur.ajouterEmploye(employe1);
        directeur.ajouterEmploye(employe2);

        // Afficher les employés du directeur
        directeur.afficherEmployes();
    }

    }



   