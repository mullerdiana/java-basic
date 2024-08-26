public class MyMethod {
    public static void main (String [] args){
        
        String firstName = "Diana";
        String lastName = "Müller";
        
        String fullName = fullName (firstName, lastName);

        System.out.println(fullName);
    }


    public static String fullName (String firstName, String lastName){
        
        return "My name is " + firstName.concat(" ").concat(lastName);
    }

}

