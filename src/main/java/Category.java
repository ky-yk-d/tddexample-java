import java.util.ArrayList;
import java.util.List;

public class Category {

    private List<Product> products = new ArrayList<>();

    public boolean contains(Product aProduct) {
        return this.products.contains(aProduct);
    }

    public void add(Product aProduct) {
        this.products.add(aProduct);
    }

}
