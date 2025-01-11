package eu.happycoders.shop.model.customer;

public record CustomerId(int value) {

    public CustomerId {
        if (value <= 0) {
            throw new IllegalArgumentException("Customer ID must be a positive integer");
        }
    }
}
