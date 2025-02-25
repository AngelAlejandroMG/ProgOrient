import java.util.ArrayList;


public class Examen {
    String nomEdutiant;
    byte note;

    public Examen(String nomEdutiant, byte note){
        this.nomEdutiant = nomEdutiant;
        this.note =note;
    }

    public void afficherResultat(){
        System.out.println(this.nomEdutiant + " "+ this.convertNote());
    }

    public char convertNote(){
        char lettre;
        if(this.note >= 100 && this.note > 90){
            lettre = 'A';
        }else if (this.note >= 80 && this.note <=90){
            lettre = 'B';
        }else if (this.note >= 70 && this.note <=80){
            lettre = 'C';
        }else if (this.note >= 60 && this.note <=70){
            lettre = 'D';
        }else{
            lettre = 'E';
        }
        return lettre;

        }
    public static void main(String[] args) {
        ArrayList <Examen> liste = new ArrayList<>();
        liste.add(new Examen("Marie Curie ", (byte) 85));
        liste.add(new Examen("Paul Martin ", (byte) 72));
        liste.add(new Examen("Jean Dupont ", (byte) 95));
        liste.add(new Examen("Lucie Durand ", (byte) 55));
        liste.add(new Examen("Sophie Lefevre",(byte) 65));

     for(int i = 0; i < liste.size(); i++){
        liste.get(i).afficherResultat();
    }
    }
}
