package com.prabhu.maven.quickstart;

import com.google.gson.Gson;
/**
 * Hello world!
 *
 */
public class App 	
{
    public static void main( String[] args )
    {
    	Gson gson = new Gson();
    	
    	System.out.println("adhvaith");
    	System.out.println("prabhu12");

    	
        System.out.println( gson.toJson("Hello World!") );
    }
}
