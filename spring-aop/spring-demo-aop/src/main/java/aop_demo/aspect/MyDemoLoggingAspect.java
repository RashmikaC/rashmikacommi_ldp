package aop_demo.aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
@Aspect
@Component
public class MyDemoLoggingAspect {
    // this is where we add all of our related advices for logging

    //lets start with a @Before advice

    @Before("execution(* aop_demo.dao.*.*(..))")
    public void beforeAddAccountAdvice(){
        System.out.println("In @Before advice");
    }
}
