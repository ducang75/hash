public class Revision {
    public static void main(String args[]){
        String answer = Input.askString("Would you like to perform the transaction?");
        if (answer == "yes")
            System.out.println("Transaction performed.");
        else
            System.out.println("Transaction cancelled.");
    }
}
