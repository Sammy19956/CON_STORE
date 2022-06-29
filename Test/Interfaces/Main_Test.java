package Interfaces;

import Model.Cashier;
import Model.Customer;
import Model.Manager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class Can_buy_productsTest {

        @Test
        void buy_products() {
            Customer one = new Customer(234);
            String result = "Customer #234 can buy products";
            String actual = "Customer #" + one.getCustomer_id() + " can buy products";
            assertEquals(result, actual);
        }
    }

    class Cashier_RoleTest {

        @Test
        void cashierRole() {
            Cashier James = new Cashier("James", 1);
            String actual = James.cashierRole();
            String result = "Cashier James (Id: 1) can sell products and dispense receipts";
            assertEquals(result, actual);
        }

        class Manager_roleTest {

            @Test
            void hire_cashier() {
                Manager Simon = new Manager("Simon");
                String actual = Simon.hire_cashier();
                String expected = "The new manager Simon and he is qualified to hire a cashier for the store.";
                assertEquals(expected, actual);
            }
        }
    }
