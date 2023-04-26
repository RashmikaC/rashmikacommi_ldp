package aop_demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount(){
        System.out.println(getClass()+"Doing my work: adding a membership account");
    }
    public void goToSleep(){
        System.out.println(getClass()+": Going into sleep");
    }
}
