package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilitarios.SeleniumUtils;

public class HomeAppPageObject implements PageObject{

	@Override
	public WebElement getComponentePorNomeCampo(String campo, Object[] parametros, WebDriver driver) {
		switch (campo) {
		case "Monetizacao":
			return SeleniumUtils.getByIdWithExplicit(driver, "mn-monetization", 30);
		default:
			return SeleniumUtils.getByXpathWithExplicit(driver, ".//*[@value='"+campo+"']", 30);
		}
	}

}
