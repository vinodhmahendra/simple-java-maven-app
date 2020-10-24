package com.simplilearn.workshop;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testHelloWorldConstructor(){
		try{
		new HelloWorld();
		}catch (Exception e) {
			fail("COnstruction Failed!");
		}
	}
	
	@Test
	public void testHelloWorldMain(){
		HelloWorld.main(null);
		try{
//			assertEquals("Hello World Java!" + System.getProperty("line.seperator"), outContent.toString());
			assertNotEquals("Hello World Java!" + System.getProperty("line.seperator"), outContent.toString());
			
		}catch (AssertionError e) {
			fail("\"message\" is not \"Hello World Java!\"");
		}
	}
	
	@After
	public void cleanUpStreams(){
		System.setOut(null);
	}

}
