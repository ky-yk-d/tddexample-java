package tddexample;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private List<Product> products = new ArrayList<>();

    public boolean contains(Product aProduct) {
        return products.contains(aProduct);
    }

    public void addProduct(Product aProduct) {
        products.add(aProduct);
    }

}
