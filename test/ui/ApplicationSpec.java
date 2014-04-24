package ui;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import play.test.UITest;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

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
}
