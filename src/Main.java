import Model.Manager;
import Model.Cashier;
import Model.Products;
import Model.Customer;

public class Main {
    public static void main(String[] args) {
        Manager John = new Manager();
        System.out.println(John.hire_cashier());

        Customer one = new Customer(234);
        System.out.println(one.buy_products());

        Cashier Matt = new Cashier("Matt", 44);
        System.out.println(Matt.cashierRole());
    }
}
