package spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("thatSillyCoach")
public class TennisCoach implements Coach{
    private FortuneService fortuneService;
//    @Autowired
//    public TennisCoach(FortuneService fortuneService)
//    {
//        this.fortuneService=fortuneService;
//    }
    @Autowired
    @Qualifier("randomFortuneService")
    public void doSomeCrazyStuff(FortuneService fortuneService)
    {
        System.out.println("Inside TennisCoach doSomeCrazyStuff method");
        this.fortuneService=fortuneService;
    }
    //init method
    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("Inside TennisCoach doMyStartUpStuff");
    }
    //destroy method
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("Inside TennisCoach doMyCleanUpStuff");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice tennis daily";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
