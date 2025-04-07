public class Main {
    public static void main(String[] args) {

        // Création d'une personne
        Personne personne = new Personne("Dupont", "Jean", 45);
        System.out.println(personne);

        // Création d'un employé
        Employe employe = new Employe("Martin", "Alice", 30, "Développeur", 3000.00);
        System.out.println(employe);

        // Création d'un directeur
        Directeur directeur = new Directeur("Durand", "Pierre", 50, 5000.00);
        System.out.println(directeur);
    }

    }



   