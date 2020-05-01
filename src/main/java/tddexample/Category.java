package tddexample;

public class Category {

    public boolean contains(Product pc) {
        if (pc.getCategory() == null) {
            return false;
        }
        return true;
    }

}
