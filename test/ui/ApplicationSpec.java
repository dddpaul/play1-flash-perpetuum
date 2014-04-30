package ui;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import play.test.UITest;

import java.util.Arrays;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.core.Is.is;

public class ApplicationSpec extends UITest
{

    @Before
    public void setUp()
    {
        open( "/" );
    }

    @Test
    public void index()
    {
        $( By.name( "submit" ) ).shouldHave( text( "Add" ) );
    }

    @Test
    public void indexJdk8()
    {
        assertThat( Arrays.asList( "1", "2" ).stream().map( Integer::parseInt ).count(), is( 2L ));
        $( By.name( "submit" ) ).shouldHave( text( "Add" ) );
    }
}
