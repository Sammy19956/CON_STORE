package Model;
import Interfaces.Can_sell_product;
import Interfaces.cashierRole;
import Enums.Roles;

public class Cashier extends Person implements cashierRole{

    private String cashier_name;
    private int cashier_id;


    public Cashier(String cashier_name, int cashier_id){
        this.cashier_name= cashier_name;
        this.cashier_id = cashier_id;

    }

    public String getCashier_name() {
        return cashier_name;
    }

    public void setCashier_name(String cashier_name) {
        this.cashier_name = cashier_name;
    }

    public int getCashier_id(){
        return cashier_id;
    }

    public void setCashier_id(int cashier_id){
        this.cashier_id=cashier_id;
    }

    @Override
    public String cashierRole(){
        return "Cashier " + cashier_name + " (Id: "+ cashier_id +")" +" can sell products and dispense receipts";
    }
}
