package suiteTeste;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testes.TestLogin;
import testes.TestMonetizacao;

@RunWith(Suite.class)
@SuiteClasses({
	//TestLogin.class,
	TestMonetizacao.class
})
public class SuiteTeste {
	
}
