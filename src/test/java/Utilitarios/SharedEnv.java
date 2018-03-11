package Utilitarios;

import pageobjects.LoginPageObject;
import pageobjects.PageObject;

public class SharedEnv {

	public static PageObject pageObject;	
	
	public static void resolveContexto(String nomeContexto){
		switch(nomeContexto){
			case "LOGIN":
				pageObject = new LoginPageObject();
				break;
			default:
				System.out.println(">>>>>>>>>>>>>>>>>>> pageObject invalida <<<<<<<<<<<<<<<<<");
		}
	}
	
}
