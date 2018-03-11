package suiteTeste;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testes.TestLogin;

@RunWith(Suite.class)
@SuiteClasses({
	TestLogin.class	
})
public class SuiteTeste {
	
}
