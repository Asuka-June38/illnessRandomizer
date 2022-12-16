import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponseProviderTest {

    private final String PositiveInput = "y";

    private String response = "";

    @BeforeEach
    public void Setup (){
        response = ResponseProvider.Get(PositiveInput);
    }

    @Test
    public void Test(){
        assertEquals("Take rest!", response);
    }
}

