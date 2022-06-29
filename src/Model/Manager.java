package Model;
import Interfaces.Manager_role;

public class Manager extends Person implements Manager_role {
    private String name;
    public Manager(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String hire_cashier(){
        return "The new manager is " + this.name + ", and he is qualified to hire a cashier for the store.";
    }
}
