package Model;
import Interfaces.Manager_role;

public class Manager extends Person implements Manager_role {
    public String hire_cashier(){
        return "The manager can hire a cashier";
    }
}
