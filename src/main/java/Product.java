public class Product {

    private Category category;

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category aCategory) {
        this.category = aCategory;
        aCategory.add(this);
    }

}
