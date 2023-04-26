package spring_demo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String emailAddress, team;
    public CricketCoach(){
        System.out.println("Inside CricketCoach constructor");
    }
    //setter method for setter injection
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("Inside CricketCoach setter fortune service");
        this.fortuneService=fortuneService;
    }
    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside CricketCoach setter email address");
        this.emailAddress = emailAddress;
    }
    public void setTeam(String team) {
        System.out.println("Inside CricketCoach setter team");
        this.team = team;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
