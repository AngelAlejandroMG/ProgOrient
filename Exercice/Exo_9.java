public class Exo_9 {

     public static void main(String[] args) {
        Etudiant etudiant = new Etudiant(1234567, "Jean Dupont");

        etudiant.evaluations[0].noteSur100 = 80;  // Examen 1
        etudiant.evaluations[1].noteSur100 = 90;  // Examen 2
        etudiant.evaluations[2].noteSur100 = 75;  // Examen Final

        // Afficher les résultats
        etudiant.afficherResultat();
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
            System.out.print(this.da + " " + this.nomComplet + " " + this.evaluations[0].noteSur100 + " "+ this.evaluations[1].noteSur100 + " " + this.evaluations[2].noteSur100 + " | " + noteFinale()); 

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
    