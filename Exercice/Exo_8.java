public class Exo_8 {

    public static void main(String[] args) {

        Evaluation eval1 = new Evaluation("Mathématique", 0.4f);

        eval1.noteSur100 = 85;

        eval1.afficherEvaluation();

    }
}

class Evaluation {
    String nom;
    Float ponderation;
    byte noteSur100 = 0;

    public Evaluation(String nom, Float ponderation) {
        this.nom = nom;
        this.ponderation = ponderation;
    }

    public float notePonderee() {
        return this.ponderation * noteSur100;
    }

    public void afficherEvaluation() {
        System.out.println("\nEvaluation :");
        System.out.println("Pondération : " + this.ponderation);
        System.out.println("Note pondérée : " + notePonderee());

    }
}
