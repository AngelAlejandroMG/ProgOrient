import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Exo_10 {

    public static void main(String[] args) {
        Random random = new Random(1);
        group groupe4 = new group( "Stream",
            new ArrayList<>(Arrays.asList(
                new Etudiant(1832491, "Alice"),
                new Etudiant(2468103, "Bob"),
                new Etudiant(3726145, "Charlie"),
                new Etudiant(4859021, "David"),
                new Etudiant(5983472, "Eve"),
                new Etudiant(6129048, "Frank"),
                new Etudiant(7235146, "Grace"),
                new Etudiant(8376012, "Hannah"),
                new Etudiant(9453023, "Isaac"),
                new Etudiant(1023485, "Jack"),
                new Etudiant(2135749, "Karen"),
                new Etudiant(3201854, "Louis"),
                new Etudiant(4337602, "Mona"),
                new Etudiant(5498321, "Nathan"),
                new Etudiant(6571984, "Olivia"),
                new Etudiant(7612493, "Paul"),
                new Etudiant(8793461, "Quincy"),
                new Etudiant(9834527, "Rachel"),
                new Etudiant(1056743, "Sam"),
                new Etudiant(2187630, "Tina"),
                new Etudiant(3265984, "Ursula"),
                new Etudiant(4306715, "Victor"),
                new Etudiant(5394120, "Wendy"),
                new Etudiant(6412309, "Xander"),
                new Etudiant(7523018, "Yara"),
                new Etudiant(8654092, "Zane"),
                new Etudiant(9735084, "Amy"),
                new Etudiant(1087416, "Ben"),
                new Etudiant(2158367, "Clara"),
                new Etudiant(3267419, "Daniel")
            ))
        );

        

        // Attribuer des notes aléatoires entre 30 et 100 pour chaque évaluation
        for (int i = 0; i < groupe4.etudiants.size(); i++) {
            for (int j = 0; j < groupe4.etudiants.get(i).evaluations.length; j++) {
                groupe4.etudiants.get(i).evaluations[j].noteSur100 = (byte) (random.nextInt(71) + 30);
            }
        }

        // Afficher les résultats avant le tri
        groupe4.afficherResultats();

        System.out.println("\n--- Après tri par note finale ---");
        // Trier les étudiants par note finale et afficher à nouveau
        groupe4.trierParNote();
        groupe4.afficherResultats();
    }
}

    class group{
        String nomCours;
        ArrayList<Etudiant> etudiants = new ArrayList<>();

        public group(String nomCours,  ArrayList<Etudiant> etudiants){
            this.etudiants = etudiants;
            this.nomCours = nomCours;
        }

       

        public byte moyenneGenerale(){
            int moyenne = 0;
            for(int i = 0 ; i < this.etudiants.size();i++){
                moyenne += this.etudiants.get(i).noteFinale();
            }
            return (byte) (moyenne / etudiants.size());
        }

        public void afficherResultats(){
            for(int i = 0; i < this.etudiants.size();i++){
                this.etudiants.get(i).afficherResultat();
            }
        }   

        public void trierParNote(){
              Collections.sort(etudiants, (etudiant1,etudiant2) -> Byte.compare(etudiant1.noteFinale(),etudiant2.noteFinale()));

        }
    }
class Etudiant{
        int da;
        String nomComplet;
        Evaluation[] evaluations = {
            new Evaluation("Examen 1", 0.2f),
            new Evaluation("Examen 2",  0.3f),
            new Evaluation("Examen Final", 0.5f)  
        };
        
        public Etudiant(int da, String nomComplet){
            this.da = da;
            this.nomComplet= nomComplet;
        }

        public byte noteFinale(){
            byte note = 0;
            for (int i =0; i < evaluations.length;i++){
                note += evaluations[i].notePonderee();
            }
            return note;
        }

        public void afficherResultat(){
            System.out.println(this.da + " " + this.nomComplet + " " + this.evaluations[0].noteSur100 + " "+ this.evaluations[1].noteSur100 + " " + this.evaluations[2].noteSur100 + " | " + noteFinale()); 

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

}