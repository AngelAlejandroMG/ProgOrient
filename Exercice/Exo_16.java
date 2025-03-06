import java.util.ArrayList;
import java.util.Scanner;
public class Exo_16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> facture = new ArrayList<>();
 
        String[] plats = {"Crevette", "Salade", "Frite", "Hamburger", "Gâteau"};
        float[] prix = {8.99f, 5.60f, 6.40f, 10.99f, 7.99f};
 
        OUTER:
        while (true) {
            System.out.println("\n1. Ajouter un item");
            System.out.println("2. Retirer un item");
            System.out.println("3. Afficher le reçu");
            System.out.println("4. Terminer la transaction");
            int choix = 0;
            System.out.println("Vous avez choisi : " + choix);
            System.out.println("Appuyer sur enter pour continuer");
            System.out.println("");
            switch (choix) {
                case 1 : {
                    for(int i = 0 ; i < plats.length ; i++){
                        String prixFormatter = String.format("%.02f$", prix[i]);
                        System.out.printf("%d. %-24s %s", (i+1), facture.get(i), prixFormatter );
                    }   System.out.print("Entrez le numéro de l'item : ");
                    choix = scanner.nextInt();
                    facture.add(plats[choix - 1]);
                }
                case 2 : {
                    afficherReçu(facture, prix);
                    System.out.print("Quel item voulez-vous retirer : ");
                    choix = scanner.nextInt();
                    facture.remove(choix);
                }
                case 3 : afficherReçu(facture, prix);
                case 4 : {
                    afficherReçu(facture, prix);
                    System.out.println();
                    System.out.println("Merci pour votre visite!");
                    break OUTER;
                }
                default : {
                }
            }
            scanner.nextLine();
        }
    }
    public static void afficherReçu(ArrayList<String> facture, float[] prix){
        double total = 0;
        for(int i = 0 ; i <  facture.size() ; i++){
            total += prix[i];
            String prixFormatter = String.format("%.02f$", prix[i]);
          System.out.printf("%d. %-24s %s", (i+1), facture.get(i), prixFormatter );
 
        }
        System.out.println("---------------------------");
        String totalFormatter = String.format("%.02f$",total);
        System.out.printf("%d. %-22s %s",  "Total", totalFormatter);
}
 