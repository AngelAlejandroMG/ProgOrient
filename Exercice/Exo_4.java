
public class Exo_4 {

    class Livre {
        String titre;
        String auteur;
        int nbPages;
        int annee;
        boolean dispo;

        public Livre(String titre, String auteur, int nbPages, int annee, boolean dispo) {
            this.titre = titre;
            this.auteur = auteur;
            this.nbPages = nbPages;
            this.annee = annee;
            this.dispo = dispo;
        }

        public void afficehrDetails() {
            System.out.println("Titre: " + titre);
            System.out.println("Auteur: " + auteur);
            System.out.println("Nombre de pages: " + nbPages);
            System.out.println("Année de parution: " + annee);
            System.out.println("Disponibilité: " + dispo);
        }
        public void emprunter(){
            if(dispo){
                dispo = false;
                System.out.println("Le livre a été emprunté");
            }
        }
        public void retourner(){
            if(!dispo){
                dispo = true;
                System.out.println("Le livre a été retourné");
            }
        }
   

    public static void main(String[] args) {
        Exo_4 exo = new Exo_4();
        Livre Livre2 = exo.new Livre("Harry Potter", "J.K. Rowling", 500, 1997, false); 
        Livre2.afficehrDetails();
        
        Livre2.emprunter();
        Livre2.retourner();
        }
    }
}