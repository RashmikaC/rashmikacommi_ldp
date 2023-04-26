package spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach cricketCoach=context.getBean("cricketCoach",Coach.class);
        Coach alphaCoach=context.getBean("cricketCoach",Coach.class);
        System.out.println(cricketCoach==alphaCoach);
        context.close();
    }
}
