package tddexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test1 {

    @Test
    public void test1() {
        Product pc = new Product();
        Object electronic = new Object();
        pc.setCategory(electronic);
        assertEquals(electronic, pc.getCategory());
    }

    @Test
    public void test2() {
        Product pc = new Product();
        Category electronic = new Category();
        pc.setCategory(electronic);
        assertTrue(electronic.contains(pc));
    }

    @Test
    public void test3() {
        Product pc = new Product();
        Category electronic = new Category();
        assertFalse(electronic.contains(pc));
    }


}
