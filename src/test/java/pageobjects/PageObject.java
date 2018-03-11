package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface PageObject {

	public WebElement getComponentePorNomeCampo(String campo, Object[] parametros, WebDriver driver);
	
}
