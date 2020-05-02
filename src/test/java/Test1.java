import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {

    @Test
    void test1() {
        Product pc = new Product();
        Object electronic = new Object();
        pc.setCategory(electronic);
        Assertions.assertEquals(electronic, pc.getCategory());
    }
}
