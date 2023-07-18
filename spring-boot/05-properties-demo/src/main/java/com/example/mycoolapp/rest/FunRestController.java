package com.example.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    // inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    //expose new endpoint
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "coach:"+coachName+" Team name: "+teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on server is "+ LocalDateTime.now();
    }

    //new endpoint for "/workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!!";
    }

    //new endpoint for "/workout"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }

}
