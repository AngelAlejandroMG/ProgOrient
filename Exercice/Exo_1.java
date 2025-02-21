import java.util.ArrayList;

public class Exo_1 {
    String nom;
    int age;

    public Exo_1(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public void afficherInfo(){
        System.out.println("je m'appele : " + this.nom + " et j'ai " + this.age + " ans");
    }

    @Override
    public String toString(){
        return "je m'appele : " + this.nom + " et j'ai " + this.age + " ans";

    }
    public static void main(String[] args) {
        ArrayList <Exo_1> liste = new ArrayList<>();
        liste.add(new Exo_1("Henry", 18));
        liste.add(new Exo_1("Jean", 89));
        liste.add(new Exo_1("Camille",18));
         
        for(int i =0;i<liste.size();i++){
            System.out.println(liste.get(i));
        }
        
    }
    
}
