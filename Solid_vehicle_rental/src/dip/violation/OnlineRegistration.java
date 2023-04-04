package dip.violation;

import dip.correction.Registration;

public class OnlineRegistration implements Registration {
    @Override
    public void register() {
        System.out.println("Online registration is done");
    }
}
