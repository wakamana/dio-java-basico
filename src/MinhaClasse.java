public class MinhaClasse {
    
    public static void main (String [] args){

            
        String firstName = "Anderson";
        String secondName = "Ferreira";

        String fullName = fullName(firstName, secondName);

        System.out.printIn(fullName);

    }   
    
    public static String fullName (String firstName, String secondName){
        return firstName.concat(" ").concat(secondName);

    }



}
