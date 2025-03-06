public class Exo_15 {
    public static void main(String[] args) {
    try{
        System.out.println("Bonjour " + args[0] + " " + args[1]);
    }catch(ArrayIndexOutOfBoundsException eabcde){
        System.out.println("Vous deviez mettre votre prénom et nom en argument, mais vous pouvez encore le faire ici : \r\n");     
    }
    
    }
    
}
