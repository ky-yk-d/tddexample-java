import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test1 {

    @Test
    void test1() {
        Product pc = new Product();
        Category electronic = new Category();
        pc.setCategory(electronic);
        assertEquals(electronic, pc.getCategory());
    }

    @Test
    void test2() {
        Product pc = new Product();
        Category electronic = new Category();
        pc.setCategory(electronic);
        assertTrue(electronic.contains(pc));
    }

}
