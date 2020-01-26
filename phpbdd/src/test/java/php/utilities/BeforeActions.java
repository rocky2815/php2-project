package php.utilities;


import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

	@Before
	public static void setUp(Scenario scen) {
		System.out.println("Chrome driver initialized.");
		PhpDriverSetup.getChromeDriver();
		System.out.println("Chrome driver opened");
	}
}
