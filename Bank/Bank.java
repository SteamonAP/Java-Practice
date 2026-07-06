package Bank;

import java.util.*;

class Account {
    public String name;
    protected String email; // only be accessed by subclass of a package
    private String password;

    // getters and setters

    public String getPassword() {
        setPassword(randomPass);
        return this.password;
    }

    private void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Amogh";
        acc1.email = "amoghpitale7@gmail.com";
        System.out.println(acc1.getPassword());
    }
}
