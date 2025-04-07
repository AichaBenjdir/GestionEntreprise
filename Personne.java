
public class Personne {
    private String nom;
    private String prenom;
    private int age;


 public Personne (String nom, String prenom, int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personne{");
        sb.append("nom=").append(nom);
        sb.append(", prenom=").append(prenom);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }



}