import models.Message;
import org.junit.*;
import play.test.*;

import java.util.List;

import static org.hamcrest.core.Is.is;

public class BasicTest extends UnitTest
{
    @Test
    public void testModel()
    {
        Message msg = Message.findById( 1L );
        assertNotNull( msg );
        assertThat( msg.text, is( "Hello, world" ) );
    }

    @Test
    public void testJdk8()
    {
        List<Message> messages = Message.findAll();
        long count = messages.stream().filter( msg -> msg.text.startsWith( "H" )).count();
        assertThat( count, is( 1L ));
    }
}
