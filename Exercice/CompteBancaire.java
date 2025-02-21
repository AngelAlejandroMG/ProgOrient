public class CompteBancaire {
    String titulaire;
    double solde;

    public CompteBancaire(String titulaire, double solde){
        this.solde = solde;
        this.titulaire= titulaire;    
    }

    public void deposer(double montant){
        this.solde += montant;

            
    }
    public void retrait(double montant){
        if(this.solde < montant){
            System.out.println("Erreur");
            return;
        }
            this.solde -= montant;
            
    }

    public void afficherSolde(){
        System.out.println("Solde de  : " + this.solde);
    }

    public void afficherInfo(){
        System.out.println(this.titulaire + " : " + this.solde);
    }

    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Angel", 10000000);
        compte.afficherSolde();
        compte.deposer(450);
        compte.retrait(800);
        compte.afficherInfo();
        
    }
}
