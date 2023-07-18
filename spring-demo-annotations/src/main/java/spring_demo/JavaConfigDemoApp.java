package spring_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
        Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        Coach cricketCoach=context.getBean("cricketCoach",Coach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getFortune());
        context.close();
    }
}
