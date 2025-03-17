package Sudoku;

public class Groupes {
    Case[] cases = new Case[9];
    int nbLeft = 9;
    Boolean[] valeurPossibles = new Boolean[]{true,true,true,true,true,true,true,true,true};

    
    public Groupes (Case[][] sudoku,  Coordonne[] coord){
        for (int i = 0 ; i < coord.length; i++ ){
            this.cases[i] = sudoku[coord[i].x][coord[i].y];
        }

    }
    
    public void retirerValeurPossible(int val){
        for(int i = 0 ; i < 0 ; i++){
            this.cases[i].valeurPossibles[val - 1 ] = false;
        }
        this.valeurPossibles[val - 1] = false;
        nbleft--;
    }

    public void afficheValeurPossible(){
        String msg = "";
        for(int i =0; i < 9 ; i++){
            msg += (i+1) + "; " + String.valueOf(this.valeurPossibles[i]);
        }
        System.out.println(msg);
    }


    public int findAndSetPlaceableCasec(){
        for(int val =1 ; val < 10; val++){
        if(this.valeurPossibles[val -1]){
            for(int i = 0; i <  9 ; i ++){
                if(this.cases[i].isLastPossible(val)){
                    this.cases[i].setValue(val);
                    return i;
                }
            }
        }
    }
        //case 2
        int nbPoss;
        int idx;
        for(int val = 1; val < 9; val++){
            if(this.valeurPossibles[val -1]){
        
                int nbPoss = 0;
                int idx = -1;
                for (int i = 0 ; i < 9; i++){
                    if(this.case[i].valeurPossibles[val -1]){
                        nbPoss++;
                        idx = i;
                    }
                }
                if(nbPoss == 1){
                    this.cases[idx].setValue(val);
                    return idx;
                }
                if(nbPoss == 0){
                    System.out.println("Erreur sudoku impossible");
                    System.exit(0);

                }
        }
    } 
}

    
    public static void main(String[] args) {
         // Création d'un sudoku (exemple simplifié, avec quelques cases déjà remplies)
         Case[][] sudoku = new Case[9][9];
         for (int i = 0; i < 9; i++) {
             for (int j = 0; j < 9; j++) {
                 sudoku[i][j] = new Case(new Coordonne(i, j));  // Crée un sudoku avec des cases vides
             }
         }
     
         // Définir des coordonnées pour un groupe (par exemple, une ligne, une colonne ou une sous-grille)
         Coordonne[] coords = new Coordonne[9];
 
         // Remplir coords avec les coordonnées des cases dans le groupe (par exemple, une ligne)
         for(int j = 0 ; j < 9 ; j++){
             coords[j] = new Coordonne(0, j);
         }
         // Créer un groupe
         Groupes groupe = new Groupes(sudoku, coords);
     
         //Afficher les valeurs possibles
         groupe.afficheValeurPossible();
 
         // Retirer une valeur possible (par exemple, la valeur 5) du groupe
         groupe.retirerValeurPossible(5);
 
         //5 devrait être retiré
         groupe.afficheValeurPossible();
     
        // testFindPlaceable(groupe, "Ne devrait pas placer : ");
 
 
         groupe.retirerValeurPossible(1);
         groupe.retirerValeurPossible(2);
         groupe.retirerValeurPossible(3);
         groupe.retirerValeurPossible(4);
         groupe.retirerValeurPossible(6);
         groupe.retirerValeurPossible(8);
 
 
        // testFindPlaceable(groupe, "Ne devrait pas placer : ");
 
       
         groupe.retirerValeurPossible(9);
        // testFindPlaceable(groupe, "Devrait placer à l'index 0 : ");
         groupe.afficheValeurPossible();
 
        
         groupe.retirerValeurPossible(7);
         groupe.afficheValeurPossible();
       //  testFindPlaceable(groupe, "Ne devrait pas placer : ");
 
 
         //Cas 2
         groupe = new Groupes(sudoku, coords);
 
 
       //  testFindPlaceable(groupe, "Ne devrait pas placer : ");
 
 
 
         //Mettre une case mûre
         /*groupe.cases[3].valeurPossible = new Boolean[]{false,true,false,false,false,false,false,false,false};
         
         //Should place at index 3
         testFindPlaceable(groupe,"Devrait placer à l'index 3 : ");
         
     }
     public static void testFindPlaceable(Groupes groupe, String should){
         int index = groupe.findAndSetPlaceableCase();
         System.out.print(should);
         if(index == -1){
             System.out.println("Aucune case à remplir");
         }
         else{
             System.out.println("Case remplie à l'index : " + index);
         }*/
    }
    class Coordonne {
        int x;
        int y;
    
        public Coordonne (int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    class Case {
        Coordonne coord;
        int value = 0;
        Boolean[] valeurPossibles = new Boolean[]{true,true,true,true,true,true,true,true,true};

    public Case (Coordonne coord){
        this.coord = coord;
    }

    public Boolean setValue(int val){
        if(val != 0){
            this.value = val;
            this.valeurPossibles = new Boolean[]{false,false,false,false,false,false,false,false,false};
            return true;
        }
        return false;

    }

    public Boolean isLastPossible(int val){
        
        for (int i = 0; i < this.valeurPossibles.length;i++){
            if(this.valeurPossibles[i] && i != val -1){
                return false;
            }
        }

        if(this.valeurPossibles[val - 1]){
            return true;
        }
        return false;
        
    }   
    @Override
    public String toString() {
        String msg = "(" + this.coord.x + " " + this.coord.y + ") " + this.value + " ";
        for(int i =0; i < 9 ; i++){
            msg += (i+1) + "; " + String.valueOf(this.valeurPossibles[i]);
        }
        return msg;
    }
    }
}
