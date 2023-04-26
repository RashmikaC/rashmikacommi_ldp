package spring_demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;
    public SwimCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim daily";
    }
    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
