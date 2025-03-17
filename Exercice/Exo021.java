import java.util.ArrayList;

class depense{
    String nom = "";
    float cout;
    enum Categorie {
        VOYAGE,
        SANTE,
        HABITATION,
        NOURRITURE,
        EDUCATION,
        LOISIR,
        DIVER 
    }
    Categorie categorie = Categorie.DIVER;

    @Override
    public String toString() {
        return String.format("%-40s%10.2f", nom, cout);
    }
    
}

class Budget {
    private float montant_total = 0.0f;
    private float montant_utilise = 0.0f;
    private depense.Categorie categorie = depense.Categorie.DIVER;
    ArrayList<depense> depenses = new ArrayList<depense>();

    // Getters et Setters avec validations
    public float getMontantTotal() {
        return montant_total;
    }

    public void setMontantTotal(float montant_total) {
        if (montant_total > 0) {
            this.montant_total = montant_total;
        } else {
            System.out.println("Erreur : Le montant total doit être strictement positif !");
        }
    }

    public float getMontantUtilise() {
        return montant_utilise;
    }

    public void setMontantUtilise(float montant_utilise) {
        if (montant_utilise <= montant_total) {
            this.montant_utilise = montant_utilise;
        } else {
            System.out.println("Erreur : Le montant utilisé ne peut pas dépasser le montant total !");
        }
    }

    public depense.Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(depense.Categorie categorie) {
        if (categorie != null) {
            this.categorie = categorie;
        } else {
            System.out.println("Erreur : Catégorie non valide !");
        }
    }

    public float getMontantRestant() {
        return montant_total - montant_utilise;
    }

    public void detailsBudget (){
        System.out.println("Montant total : " + montant_total + "€");
        System.out.println("Montant utilisé : " + montant_utilise + "€");
        System.out.println("Montant restant : " + getMontantRestant() + "€");
        System.out.println("Catégorie : " + categorie);
        System.out.println("Dépenses : ");
        System.out.println("Nom de la dépense" + " ".repeat(30) + "Coût");
        for (depense d : depenses) {
            System.out.println(d);
        }
    }

    public boolean comparerBudget(Budget b){
        if(b == null){
            return false;
        }
        return this.montant_total == b.montant_total && this.montant_utilise == b.montant_utilise && this.categorie == b.categorie;
    }

    public String verifierEquilibre(){
        if (montant_utilise > montant_total){
            return "en exces";
        } else if (montant_utilise == montant_total){
            return "Equilibre parfait";
        } else {
            return "En deficit";
        }
    }

}

public class Exo021 {
    public static void main(String[] args) {
        
    }
}
