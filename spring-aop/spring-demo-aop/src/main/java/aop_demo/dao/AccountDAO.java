package aop_demo.dao;

import aop_demo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount(Account tyeAccount, boolean vipFlag) {
        System.out.println(getClass()+"Doing my work : adding an account");
    }

    public boolean doWork(){
        System.out.println(getClass()+": doWork()");
        return false;
    }
}
