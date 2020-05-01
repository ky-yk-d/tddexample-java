package tddexample;

public class Product {

    private Category category;

    public void setCategory(Category aCategory) {
        category = aCategory;
        aCategory.addProduct(this);
    }

    public Category getCategory() {
        return category;
    }

}
