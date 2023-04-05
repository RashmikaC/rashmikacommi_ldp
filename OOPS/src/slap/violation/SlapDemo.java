package slap.violation;

public class SlapDemo {
    public void getDetailsAndMail(){
        //code to fetch details from database
        System.out.println("Fetching details from database");
        //code to email the user
        System.out.println("Mailing the user");
    }
}
//Here getting details from database is in lower level of abstraction as compared to mail functionality
// when we have different level of abstractions, we need to create new method for that functionality