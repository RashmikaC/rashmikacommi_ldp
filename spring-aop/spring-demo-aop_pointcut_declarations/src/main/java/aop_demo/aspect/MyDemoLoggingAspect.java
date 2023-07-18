package aop_demo.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
@Aspect
@Component
public class MyDemoLoggingAspect {
    // this is where we add all of our related advices for logging

    //lets start with a @Before advice

    @Pointcut("execution(* aop_demo.dao.*.*(..))")
    private void forDaoPackage(){}

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice(){
        System.out.println("In @Before advice");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics(){
        System.out.println("In @Before advice , performing Api Analytics");
    }
}
