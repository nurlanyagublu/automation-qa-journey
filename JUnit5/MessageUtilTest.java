package JUnit5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessageUtilTest {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals("ne var ne yox pesi" ,messageUtil.printMessage());
    }
}