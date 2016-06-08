import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModelTest {
    private Model model;
    @Before
    public void setUp() throws Exception {
        this.model = new Model();
    }
    @Test
    public void testGetHelloWorld() {
        assertEquals("Hello World", this.model.getHelloWorld());
    }
} 