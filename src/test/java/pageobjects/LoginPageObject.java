package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilitarios.SeleniumUtils;

public class LoginPageObject implements PageObject{

	@Override
	public WebElement getComponentePorNomeCampo(String campo, Object[] parametros, WebDriver driver) {
		switch (campo) {
		case "Entrar":
			return SeleniumUtils.getByIdWithExplicit(driver, "login", 30);
		case "Email":
			return SeleniumUtils.getByIdWithExplicit(driver, "inputEmail", 30);
		case "Senha":
			return SeleniumUtils.getByIdWithExplicit(driver, "inputPassword", 30);
		case "MENSAGEM":
			return SeleniumUtils.getByXpathWithExplicit(driver, ".//div[@class='alert alert-error']", 30);
		default:
			return SeleniumUtils.getByXpathWithExplicit(driver, ".//*[@value='"+campo+"']", 30);
		}
	}

}
