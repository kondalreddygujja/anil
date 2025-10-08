package demotest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class demo {
	@RepeatedTest(2)
	@Test
public void show()

{
		System.out.println("this is method");
		}
	@Test
	void hello()
	{
		System.out.println("this is another method");

	}
	 @DisplayName("Show Method Test")
	    void shoow() {
	        System.out.println("This is show() method");
	    }

	    @Disabled
	    void hii() {
	        System.out.println("This is hii() method (disabled)");
	    }

	    @Test
	    @DisplayName("Hello Method Test")
	    void hell() {
	        System.out.println("This is hello() method");
	    }
	

}
