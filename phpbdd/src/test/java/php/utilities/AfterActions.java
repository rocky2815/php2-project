package php.utilities;

import cucumber.api.java.After;

public class AfterActions {
	
	@After
    public static void tearDown() {
		System.out.println(">> End of the transaction");
    	PhpDriverSetup.tearDown();
	}
}