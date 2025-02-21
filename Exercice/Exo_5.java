

public class Exo_5 {

    class Etudiant {
        String nom;
        int age;
        double moyenne;

        public Etudiant(String nom, int age, double moyenne) {
            this.nom = nom;
            this.age = age;
            this.moyenne = moyenne;
        }

        public void estAdmis() {
            if (this.moyenne >= 10)  {
                System.out.println("L'étudiant " + this.nom + " est admis");
            } else {
                System.out.println("L'étudiant " + this.nom + " est recalé");
            }
        }

        public void afficherDetails() {
            System.out.println("Nom: " + this.nom);
            System.out.println("Age: " + this.age);
            System.out.println("Moyenne: " + this.moyenne);
        }
    } 

    public static void main(String[] args) {
        Exo_5 exo = new Exo_5();
        Etudiant etudiant1 = exo.new Etudiant("Jean", 20, 12.5);
        etudiant1.afficherDetails();
        etudiant1.estAdmis();
    }
}
