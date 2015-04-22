package com.pillar.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App myApp = new App();
        System.out.println( myApp.getGreeting() );
    }

    public String getGreeting()
    {
    	return "Hi. I'm a Foo!";
    }
}
