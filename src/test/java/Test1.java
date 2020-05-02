import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    @Test
    void test1() {
        Product pc = new Product();
        Object electronic = new Object();
        pc.setCategory(electronic);
        assertEquals(electronic, pc.getCategory());
    }

}
