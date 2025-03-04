public class Main{
       //1.1 J'importe le Sudoku à résoudre sous forme de tableau 2 dimensions d'entiers nommé problème
       int[][] probleme = Problemes.probleme1();

       //1.2 J'instancie un tableau de Case 9x9 qui va traduire mon probleme en un objet plus utile nommé sudoku
       Case[][] sudoku = new Case[9][9];

       //1.3 J'instancie un tableau de 27 groupes, il me servira à différencier les 27 groupes avec
       //   des règles dans un Sudoku : 9 lignes, 9 colonnes, 9 boites (3 x 3)
       Groupes[] groupes = new Groupes[27];

       //1.4 J'instancie un tableau de 9 Coordonne, il me servira pour mettre les coordonnées respectives de chaque groupe, je le nomme coords
       Coordonne[] coords = new Coordonne[9];


       test1(probleme, sudoku, groupes, coords);
       
       
       
        

        /*
         * 
         *                        ÉTAPE 2 : ASSIGNATION DES VARIABLES
         * 
         */
        //2.1 J'assigne à toutes les Cases de sudoku l'objet Case avec les bons paramètres initials
        for(int i = 0; i < 9 ; i++){
            for(int j = 0; j < 9 ; j++){
                sudoku[i][j] = new Case(new Coordonne(i, j));
            }
        }        
        



        /*                      Coordonnées
         * (0,0) (0,1) (0,2)  (0,3) (0,4) (0,5)  (0,6) (0,7) (0,8)
         * (1,0) (1,1) (1,2)  (1,3) (1,4) (1,5)  (1,6) (1,7) (1,8)
         * (2,0) (2,1) (2,2)  (2,3) (2,4) (2,5)  (2,6) (2,7) (2,8)
         *
         * (3,0) (3,1) (3,2)  (3,3) (3,4) (3,5)  (3,6) (3,7) (3,8)
         * (4,0) (4,1) (4,2)  (4,3) (4,4) (4,5)  (4,6) (4,7) (4,8)
         * (5,0) (5,1) (5,2)  (5,3) (5,4) (5,5)  (5,6) (5,7) (5,8)
         *
         * (6,0) (6,1) (6,2)  (6,3) (6,4) (6,5)  (6,6) (6,7) (6,8)
         * (7,0) (7,1) (7,2)  (7,3) (7,4) (7,5)  (7,6) (7,7) (7,8)
         * (8,0) (8,1) (8,2)  (8,3) (8,4) (8,5)  (8,6) (8,7) (8,8)
         *
         * 
         * 
         */
        // 2.2 Les indices [0,8] correspondent aux lignes du sudoku. Pour chaque ligne, je crée d'abord un tableau de 9 objets Coordonne,
        // puis je les initialises avec les coordonnées correspondantes à chaque colonne de la ligne. Ensuite, je crée un objet Groupes
        // en utilisant le tableau de Coordonne, et je l'assigne à la ligne correspondante du tableau 'groupes'.
        // Ce processus est répété pour chaque ligne.
               


        // Les indices [9, 17] correspondent aux colonnes du sudoku. Pour chaque colonne, je crée d'abord un tableau de 9 objets Coordonne,
        // puis je les initialises avec les coordonnées correspondantes à chaque ligne de la colonne. Ensuite, je crée un objet Groupes
        // en utilisant ce tableau de Coordonne et je l'assigne à la position correspondante du tableau 'groupes' (indices [9, 17]).
        // Ce processus est répété pour chaque colonne.
        //CodeHere        

               
        // Les indices [18, 26] correspondent aux boites du sudoku. Pour chaque boite, je crée d'abord un tableau de 9 objets Coordonne,
        // puis je les initialises avec les coordonnées correspondantes à chaqu'une des neuf cases correspondante. Ensuite, je crée un objet Groupes
        // en utilisant ce tableau de Coordonne et je l'assigne à la position correspondante du tableau 'groupes' (indices [18, 26]).
        // Ce processus est répété pour chaque boite.
        /*
         * 0 0 0  1 1 1  2 2 2
         * 0 0 0  1 1 1  2 2 2
         * 0 0 0  1 1 1  2 2 2
         * 
         * 3 3 3  4 4 4  5 5 5
         * 3 3 3  4 4 4  5 5 5
         * 3 3 3  4 4 4  5 5 5
         * 
         * 6 6 6  7 7 7  8 8 8
         * 6 6 6  7 7 7  8 8 8
         * 6 6 6  7 7 7  8 8 8
         */
        //CodeHere

       //J'assigne à toutes les cases du Sudoku leur valeur provenant du problème, puis si cette valeur est > 0, je retire cette valeur des valeurPossibles de la ligne, colonne et boite correspondantes.
        //CodeHere



        // test2_1(sudoku);
        // test2_2(groupes);
        // test2_3(groupes);
        // test2_4(groupes);
        // test2_5(groupes);


        
        /*
         * 
         *                        ÉTAPE 3 : Afficher le sudoku
         * 
         */
        // afficheSudoku(sudoku);

        //Le test ici est visuel XD


        /*
         * 
         *                        ÉTAPE 4 : Résoudre le sudoku
         * 
         * 
        */
        /*
        * Cette boucle est infinie et s'arrête lorsque tous les groupes sont complétés.
        * À chaque itération, elle affiche "Loop #", suivi du numéro de la boucle.
        * Ensuite, elle parcourt chaque groupe pour vérifier s'il est terminé.
        * Si un groupe n'est pas terminé, la méthode `findAndSetPlaceableCase()` tente de lui assigner une valeur.
        * Si une valeur est assignée, les lignes, colonnes et boîtes correspondantes sont mises à jour.
        * Après chaque itération, le code vérifie de nouveau si le groupe est terminé.
        * 
        * À chaque itération de la boucle, l'état actuel du Sudoku est affiché.
        */

        //CodeHere Bonne chance ;)


        /*
            8     |   1   |      
            4     | 7   2 | 9    
              9 2 | 3     |      
            ---------------------
                  |   4   | 8    
              4 1 | 8     | 7 9  
                8 |       |   6 3
            ---------------------
            2 3   |   7   |      
                  |       |   7 5
                  | 1 9   |   4  

            Loop #0


            8   3 |   1   |   2  
            4     | 7   2 | 9 3  
              9 2 | 3     |      
            ---------------------
            3     |   4   | 8   1
              4 1 | 8 3   | 7 9 2
                8 |       | 4 6 3
            ---------------------
            2 3   |   7   |     9
                  |       |   7 5
                  | 1 9 3 | 2 4  

            Loop #1


            8   3 |   1 9 |   2  
            4 1   | 7   2 | 9 3  
              9 2 | 3     |      
            ---------------------
            3 2 6 |   4 7 | 8 5 1
            5 4 1 | 8 3   | 7 9 2
            9 7 8 |     1 | 4 6 3
            ---------------------
            2 3 4 |   7   |     9
            1   9 |       | 3 7 5
                  | 1 9 3 | 2 4  

            Loop #2


            8 6 3 |   1 9 | 5 2 7
            4 1 5 | 7   2 | 9 3 6
            7 9 2 | 3     |   8 4
            ---------------------
            3 2 6 | 9 4 7 | 8 5 1
            5 4 1 | 8 3 6 | 7 9 2
            9 7 8 |     1 | 4 6 3
            ---------------------
            2 3 4 |   7   |   1 9
            1 8 9 |     4 | 3 7 5
            6 5 7 | 1 9 3 | 2 4 8

            Loop #3


            8 6 3 | 4 1 9 | 5 2 7
            4 1 5 | 7 8 2 | 9 3 6
            7 9 2 | 3 6 5 | 1 8 4
            ---------------------
            3 2 6 | 9 4 7 | 8 5 1
            5 4 1 | 8 3 6 | 7 9 2
            9 7 8 | 2 5 1 | 4 6 3
            ---------------------
            2 3 4 | 5 7 8 | 6 1 9
            1 8 9 | 6 2 4 | 3 7 5
            6 5 7 | 1 9 3 | 2 4 8

            Loop #4


            8 6 3 | 4 1 9 | 5 2 7
            4 1 5 | 7 8 2 | 9 3 6
            7 9 2 | 3 6 5 | 1 8 4
            ---------------------
            3 2 6 | 9 4 7 | 8 5 1
            5 4 1 | 8 3 6 | 7 9 2
            9 7 8 | 2 5 1 | 4 6 3
            ---------------------
            2 3 4 | 5 7 8 | 6 1 9
            1 8 9 | 6 2 4 | 3 7 5
            6 5 7 | 1 9 3 | 2 4 8
        */
    public static void main(String[] args){
        
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
     class Groupes {
        Case[] cases = new Case[9];
        int nbLeft = 9;
        Boolean[] valeurPossibles = new Boolean[]{true,true,true,true,true,true,true,true,true};
    
        
        public Groupes (Case[][] sudoku,  Coordonne[] coord){
            for (int i = 0 ; i < coord.length; i++ ){
                this.cases[i] = sudoku[coord[i].x][coord[i].y];
            }
    
        }
        
        public void retirerValeurPossible(int val){
            nbLeft--;
    
            this.valeurPossibles[val - 1] = false;
    
            for(int i = 0 ; i < 0 ; i++){
                this.cases[i].valeurPossibles[val - 1 ] = false;
            }
        }
    
        public void afficheValeurPossible(){
            String msg = "";
            for(int i =0; i < 9 ; i++){
                msg += (i+1) + "; " + String.valueOf(this.valeurPossibles[i]);
            }
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
