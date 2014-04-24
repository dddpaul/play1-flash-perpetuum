package controllers;

import play.mvc.*;

public class Application extends Controller
{
    public static void index()
    {
        render();
    }

    public static void add()
    {
        flash.success( "Something is added, reload this page ..." );
        index();
    }

    public static void clearFlash()
    {
        flash.success( "" );
        index();
    }
}
