import abstraction.Apple;
import abstraction.Samsung;
import association.aggregation.College;
import association.aggregation.Teacher;
import association.composition.House;
import data_hiding.BankAccount;
import delegation_principle.FlightTicket;
import delegation_principle.TicketBookingByAgent;
import delegation_principle.TrainTicket;
import encapsulation.Account;
import polymorphism.overloading.Add;
import polymorphism.overriding.Car;
import polymorphism.overriding.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        BankAccount myAccount=new BankAccount();
//        double myBalance=myAccount.getBalance("MyUserName","MyPassWord");
//        System.out.println(myBalance);
//        Apple myPhone=new Apple();
//        myPhone.calling("0123");
//        myPhone.addContacts("7896");
//        Samsung newPhone=new Samsung();
//        newPhone.addContacts("3456");
//        newPhone.sendMessage("Hello");
//        Account acc=new Account();
//        acc.setBalance(10000);
//        System.out.println(acc.getBalance());
//        List<Teacher> teachers=new ArrayList<Teacher>();
//        teachers.add(new Teacher("Rohn","Java"));
//        teachers.add(new Teacher("John","Python"));
//        College college=new College("MyCollege",teachers);
//          House house=new House();
//        System.out.println(house.getFood());
//          Add add=new Add();
//          add.sum(10,15,16);
//          add.sum(10,15);
//          add.sum(10.25,15.20);
//          add.sum(10.25f,15.20);// float converted to double internally
//           Vehicle v=new Vehicle();
//           v.run();
//           Car c=new Car();
//           c.run();
//           Vehicle vc=new Car();
//           vc.run();
//        TicketBookingByAgent agent=new TicketBookingByAgent(new TrainTicket());
//        agent.bookTicket();
        TicketBookingByAgent agent=new TicketBookingByAgent(new FlightTicket());
        agent.bookTicket();
    }
}