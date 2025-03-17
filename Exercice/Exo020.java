class Personne{
    String nom = "";
    int age = -1;
    String ville = "";

     // Getter pour nom
     public String getNom() {
        return nom;
    }

    // Setter pour nom
    public void setNom(String nom) {
        if (nom != null) {
            this.nom = nom;
        } else {
            System.out.println("Erreur : Le nom ne peut pas être nul.");
        }
    }

    // Getter pour âge
    public int getAge() {
        return age;
    }

    // Setter pour âge avec validation
    public void setAge(int age) {
        if (age >= 0 && age <= 125) {
            this.age = age;
        } else {
            System.out.println("Erreur : L'âge doit être compris entre 0 et 125 ans.");
        }
    }

    // Getter pour ville
    public String getVille() {
        return ville;
    }

    // Setter pour ville
    public void setVille(String ville) {
        if (ville != null) {
            this.ville = ville;
        } else {
            System.out.println("Erreur : La ville ne peut pas être nulle.");
        }
    }

    // Affichage des informations (facultatif, pratique pour tester)
    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        System.out.println("Ville : " + ville);
    }


    

}

public class Exo020 {
    public static void main(String[] args) {
        // Création d'une instance de la classe Personne
    Personne personne1 = new Personne();

        personne1.setNom("Alice");
        personne1.setAge(30);
        personne1.setVille("Paris");

        personne1.afficherInfos();

        // Exemple avec une erreur sur l'âge
        personne1.setAge(150); // Message d'erreur
    }
}
