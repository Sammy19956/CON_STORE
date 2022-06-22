package Model;

public class Products {
    private String product_name;
    private int product_qty;
    private int product_price;

//    public Products(String product_name, int product_qty, int product_price){
//        this.product_name = product_name;
//        this.product_qty = product_qty;
//        this.product_price = product_price;
//    }

    public Products(String product_name, int product_qty, int product_price) {
        this.product_name = product_name;
        this.product_qty = product_qty;
        this.product_price = product_price;
    }

    public String getProduct_name(){
        return product_name;
    }
    public void setProduct_name(String product_name){
        this.product_name= product_name;
    }

    public int getProduct_qty(){
        return product_qty;
    }
    public void setProduct_qty(int product_qty){
        this.product_qty=product_qty;
    }

    public int getProduct_price(){
        return product_price;
    }

    public void setProduct_price(int product_price){
        this.product_price = product_price;
    }
}
