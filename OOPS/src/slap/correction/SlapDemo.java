package slap.correction;

public class SlapDemo {
    public void getDetails(){
        //code to fetch details from database
        System.out.println("Fetching details from database");
        String details="Details";
        mailTheUser(details);
    }
    public void mailTheUser(String details){
        //code to email the user
        System.out.println("Mailing the user");
    }
}
