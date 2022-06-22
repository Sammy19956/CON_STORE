package Model;
import Interfaces.Can_buy_products;

public class Customer extends Person implements Can_buy_products{
    private String name;
    private int Customer_id;


    public Customer(int Customer_id){
        this.Customer_id= Customer_id;

    }
    public int getCustomer_id(){
        return Customer_id;
    }

    public void setCustomer_id(int Customer_id){
        this.Customer_id=Customer_id;
    }

    @Override
    public String buy_products(){
        return "Customer #" + Customer_id + " can buy products";
    }
}
