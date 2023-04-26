package aop_demo.dao;

import aop_demo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    private String name;
    private String serviceCode;
    public void addAccount(Account tyeAccount, boolean vipFlag) {
        System.out.println(getClass()+"Doing my work : adding an account");
    }

    public boolean doWork(){
        System.out.println(getClass()+": doWork()");
        return false;
    }

    public String getName() {
        System.out.println(getClass()+" in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass()+" in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass()+" in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass()+" in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
