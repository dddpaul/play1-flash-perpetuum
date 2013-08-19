package controllers;

import play.mvc.*;

public class Application extends Controller
{
    @Before
    static void setUp()
    {
        // This is necessary to reproduce bug
        flash.put( "warning", "Warning" );
    }

    public static void index()
    {
        render();
    }

    public static void add()
    {
        flash.success( "Something is added, reload this page ..." );
        flash.error( "... and you will see me again" );
        index();
    }

    public static void clearFlash()
    {
        flash.success( "" );
        flash.error( "" );
        index();
    }
}
