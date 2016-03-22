import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Mock
    private Calculator calculator;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAbs(){
        when(calculator.abs(-20)).thenReturn(20);
        assertEquals(20, calculator.abs(-20));
    }

}
