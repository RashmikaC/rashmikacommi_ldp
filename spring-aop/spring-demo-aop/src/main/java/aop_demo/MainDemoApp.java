package aop_demo;

import aop_demo.dao.AccountDAO;
import aop_demo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {
        //read spring config java class
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        //get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);

        //get membership bean from spring container
        MembershipDAO theMembershipDAO=context.getBean("membershipDAO",MembershipDAO.class);

        // call the business method
        theAccountDAO.addAccount(new Account(),true);
        theAccountDAO.doWork();

        theMembershipDAO.addAccount();
        theMembershipDAO.goToSleep();

//        //do it again
//        System.out.println("Calling mathod again!!");
//        theAccountDAO.addAccount();

        //close the context
        context.close();
    }
}
