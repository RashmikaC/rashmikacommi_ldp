package aop_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    @Pointcut("execution(* aop_demo.dao.*.*(..))")
    public void forDaoPackage(){}

    //create pointcut for getter methods
    @Pointcut("execution(* aop_demo.dao.*.get*(..))")
    public void getter(){}

    //create pointcut for setter methods

    @Pointcut("execution(* aop_demo.dao.*.set*(..))")
    public void setter(){}

    // create pointcut include package and exclude getter and setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter(){}
}
