package com.techweb.hello.demo_helloworld;

/**
 * Hello world!
 *
 */
public class App 
{
	public String Hello() {
		return "Hello World!";
	}
    public static void main( String[] args )
    {
    	App ob=new App();
        System.out.println(ob.Hello());
    }
}
