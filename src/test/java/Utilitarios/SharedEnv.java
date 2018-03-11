package Utilitarios;

import pageobjects.HomeAppPageObject;
import pageobjects.LoginPageObject;
import pageobjects.MonetizacaoPageObject;
import pageobjects.PageObject;

public class SharedEnv {

	public static PageObject pageObject;	
	
	public static void resolveContexto(String nomeContexto){
		switch(nomeContexto){
			case "LOGIN":
				pageObject = new LoginPageObject();
				break;
			case "HOMEAPP":
				pageObject = new HomeAppPageObject();
				break;
			case "Monetizacao":
				pageObject = new MonetizacaoPageObject();
				break;
			default:
				System.out.println(">>>>>>>>>>>>>>>>>>> pageObject invalida <<<<<<<<<<<<<<<<<");
		}
	}
	
}
