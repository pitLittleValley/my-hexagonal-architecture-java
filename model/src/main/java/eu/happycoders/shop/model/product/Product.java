package eu.happycoders.shop.model.product;

import eu.happycoders.shop.model.money.Money;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor
public class Product {
    private final ProductId id;
    private final String name;
    private final String description;
    private final int itemsInStock;
    private final Money price;
}
