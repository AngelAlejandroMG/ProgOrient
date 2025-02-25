
public class Exo_6 {
        public static void main(String[] args) {
            cercle cercle1 = new cercle(5);
            cercle1.afficherDetails();
        }
    }
    
    class cercle {
        double rayon;

        public cercle(double rayon) {
            this.rayon = rayon;
        }

        public double calculerPerimetre() {
            return 2 * Math.PI * this.rayon;
        }

        public double calculerAire() {
            return Math.PI * Math.pow(this.rayon, 2);
        }

        public void afficherDetails() {
            System.out.println("Rayon: " + this.rayon);
            System.out.println("Périmètre: " + this.calculerPerimetre());
            System.out.println("Aire: " + this.calculerAire());
        }
    }
