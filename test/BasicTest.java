import models.Message;
import org.junit.*;
import play.test.*;

import static org.hamcrest.core.Is.is;

public class BasicTest extends UnitTest {

    @Test
    public void testModel()
    {
        Message msg = Message.findById( 1L );
        assertNotNull( msg );
        assertThat( msg.text, is( "Hello, world" ));
    }
}
