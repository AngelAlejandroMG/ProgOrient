
public class exo_7 {

    public static void main(String[] args) {
        rextangle r1 = new rextangle(5, 3);
        r1.afficherInfos();
    }
}

class rextangle {
    double longueur;
    double largeur;

    public rextangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double calculerAire() {
        return this.longueur * this.largeur;
    }

    public double calculerPerimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    public void afficherInfos() {
        System.out.println("Longueur: " + this.longueur);
        System.out.println("Largeur: " + this.largeur);
        System.out.println("Aire: " + this.calculerAire());
        System.out.println("Périmètre: " + this.calculerPerimetre());

    }
}
