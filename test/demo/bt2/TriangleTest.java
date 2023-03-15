package demo.bt2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void triangle() {
        int a = 3,b=3,c= (int) (3*Math.sqrt(2));
        String expected = "Tam giác đều";
        String result = Triangle.triangle(a,b,c);
        assertEquals(expected,result);
    }
}