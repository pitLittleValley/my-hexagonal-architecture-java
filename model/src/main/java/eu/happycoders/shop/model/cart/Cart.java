package eu.happycoders.shop.model.cart;

import eu.happycoders.shop.model.customer.CustomerId;
import eu.happycoders.shop.model.money.Money;
import eu.happycoders.shop.model.product.Product;

public class Cart {

    private CustomerId id;

    public void addProduct(Product product, int quantity) {
        // ...
    }

    public int numberOfItems(){
     return 0;
    }

    public Money subTotal(){
        return null;
    }

}
