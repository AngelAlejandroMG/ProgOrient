class Personne {
    private String nom;
    private int age;
    private String adresse;

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Personne(String nom, int age, String adresse) {
        setNom(nom);
        setAge(age);
        setAdresse(adresse);
    }

    public void sePresenter (){
        System.out.println("Je m'appelle " + getNom() + " et j'ai " + getAge() + " ans et j'habite à " + getAdresse());
    }
}

class Etudiant extends Personne {
    private String filiere;
    private String numEtudiant;

    public String getFiliere() {
        return filiere;
    }

    public String getNumEtudiant() {
        return numEtudiant;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public void setNumEtudiant(String numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public Etudiant(String nom, int age, String adresse, String filiere, String numEtudiant) {
        super(nom, age, adresse);
        setFiliere(filiere);
        setNumEtudiant(numEtudiant);
        sePresenter();
    }
    

    public void etudier (){
        System.out.println("L'étudiant " + getNom() + " étudie en " + getFiliere());
    }

    
}

class Professeur extends Personne {
    private String matiere;
    private double salaire;

    public String getMatiere() {
        return matiere;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Professeur(String nom, int age, String adresse, String matiere, double salaire) {
        super(nom, age, adresse);
        setMatiere(matiere);
        setSalaire(salaire);
        sePresenter();
    }

    public void enseigner(){
        System.out.println("Le professeur " + getNom() + " enseigne en " + getMatiere());
    }

}

public class Exo_28 {
    public static void main(String[] args) {
        Personne personne = new Personne("Jean", 40, "10 rue des Lilas");
        Etudiant etudiant = new Etudiant("Paul", 20, "12 rue des Roses", "Informatique", "123456");
        Professeur professeur = new Professeur("Marie", 30, "14 rue des Tulipes", "Mathématiques", 2000);
 
    personne.sePresenter();
    etudiant.sePresenter();
    professeur.sePresenter();
    etudiant.etudier();
    professeur.enseigner();
        
    }
}
