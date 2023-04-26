package spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach{
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    public CricketCoach(){
        System.out.println("Inside CricketCoach constructor");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("Inside CricketCoach FS setter");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice cricket daily";
    }
    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
