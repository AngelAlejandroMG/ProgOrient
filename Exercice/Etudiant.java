public class Etudiant{
    String nom;
    int age;

public Etudiant(String nom, int age){
    this.nom = nom;
    this.age = age;
}

public void afficherInfo(){
    System.out.println("je m'appele : " + this.nom + " et j'ai " + this.age + " ans");
}
public static void afficher(){
    System.out.println("je suis une classe");
}
    
    public static void main(String[] args) {
        Etudiant bob = new Etudiant("Bob", 21);
        Etudiant angel = new Etudiant("Angel", 17); 
        bob.afficherInfo();
        angel.afficherInfo();
        Etudiant.afficher();
    }   


}

