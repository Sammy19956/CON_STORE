package Model;
import Enums.Roles;

public class Staff extends Person{
    private int staff_id;
    private String name;
    private Roles role;

    public Staff(int staff_id, String name, Roles role){
        this.staff_id = staff_id;
        this.name = name;
        this.role = role;
    }

    public int getStaff_id(){
        return staff_id;
    }
    public void setStaff_id(int staff_id){
        this.staff_id = staff_id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public Roles getRole(Roles role){
        return role;
    }
    public void setRole(Roles role){
        this.role = role;
    }

    public String cashier_role(Roles role){
        if(role == Roles.CASHIER){
            return role + "Sells to customers and dispenses receipts";
        }
        return role + "cannot sell to customers and cannot dispense receipts";
    }


}
