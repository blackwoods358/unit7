import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    public void shouldFIbIput(){
        Fibonacci fb = new Fibonacci();
        Fibonacci.fibonacci(5);
        Assertions.assertEquals(5, Fibonacci.fibonacci(5));

    }



}