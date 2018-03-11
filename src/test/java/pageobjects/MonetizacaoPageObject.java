package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilitarios.SeleniumUtils;

public class MonetizacaoPageObject implements PageObject{

	@Override
	public WebElement getComponentePorNomeCampo(String campo, Object[] parametros, WebDriver driver) {
		switch (campo) {
		case "Criar campanha":
			return SeleniumUtils.getByIdWithExplicit(driver, "create-campaign", 30);
		case "Nome da campanha":
			return SeleniumUtils.getByNameWithExplicit(driver, "name", 30);
		default:
			return SeleniumUtils.getByXpathWithExplicit(driver, ".//*[@value='"+campo+"']", 30);
		}
	}

}
