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

    //create pointcut for getter methods
    @Pointcut("execution(* aop_demo.dao.*.get*(..))")
    private void getter(){}

    //create pointcut for setter methods

    @Pointcut("execution(* aop_demo.dao.*.set*(..))")
    private void setter(){}

    // create pointcut include package and exclude getter and setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter(){}

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(){
        System.out.println("In @Before advice");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics(){
        System.out.println("In @Before advice , performing Api Analytics");
    }
}
