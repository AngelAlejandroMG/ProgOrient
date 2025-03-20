class Animal{
    private String nom;
    private int age;
    private String race;

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRace(String race) {
        this.race = race;   
    }

    public Animal(String nom, int age, String race){
        setNom(nom);
        setAge(age);
        setRace(race);
    }

    
}
class Chien extends Animal{


    public Chien(String nom, int age, String race){
        super(nom, age, race);
    }

    public void parler(){
        System.out.println("Woof");
    }

    public void sePresenter(){
        System.out.printf("Je suis un " + getRace() + " et je m'appelle " + getNom() + " et j'ai " + getAge() + " ans");
    }
}
class Chat extends Animal{

    public Chat(String nom, int age, String race){
        super(nom, age, race);
    }

    public void parler(){
        System.out.println("Meow");
    }

    public void sePresenter(){
        System.out.printf("Je suis un " + getRace() + " et je m'appelle " + getNom() + " et j'ai " + getAge() + " ans");
    }   
}

public class Exo_26 {
    public static void main(String[] args) {
        Chien chien = new Chien("Rex", 3, "Berger Allemand");
        Chat chat = new Chat("Matou", 12, "Sphinx");
        chien.sePresenter();
        chien.parler();
    
        chat.sePresenter();
        chat.parler();   
    }
    
}
