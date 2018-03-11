package stepdefs.geral;



import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilitarios.SeleniumUtils;
import Utilitarios.SharedEnv;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;



public class GeralStepdef {

	private WebDriver driver = SeleniumUtils.getDriver(); 

	@Dado("^Que estou na URL \"([^\"]*)\"$")
	public void que_estou_na_URL(String url) throws Throwable {
		driver.get(url);
	}

	@Dado("^reconheço as variáveis \"([^\"]*)\"$")
	public void reconheço_as_variáveis(String nomeContexto) throws Throwable {
		SharedEnv.resolveContexto(nomeContexto);	    
	}

	@Dado("^escrevo no campo \"([^\"]*)\" o conteúdo \"([^\"]*)\"$")
	public void escrevo_no_campo_o_suario(String campo, String valor) throws Throwable {
		SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver).clear();
		SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver).sendKeys(valor);
	}

	@Dado("^clico no botão \"([^\"]*)\"$")
	public void clico_no_botão(String campo) throws Throwable {
		SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver).click();
	}

	@Dado("^aperto a tecla \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void aperto_a_tecla_no_campo(String tecla, String campo) throws Throwable{
		SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver).sendKeys(Keys.valueOf(tecla));
	}

	@Dado("^seleciono no combo \"([^\"]*)\" a opção \"([^\"]*)\"$")
	public void seleciono_no_combo_a_opção(String campo, String opcao) throws Throwable {
		Select dropdonw = new Select(SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver));
		dropdonw.selectByVisibleText(opcao);
	}

	@Então("verifico em \"([^\"]*)\" o conteúdo \"([^\"]*)\"$")
	public void verificar_conteudo_mensagem(String campo, String mensagem){
		Assert.assertTrue(SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver).getText().contains(mensagem));		
	}
	
	@Então("^verifico se é exibido alguma \"([^\"]*)\"$")
	public void verificar_conteudo_mensagem(String campo){ 
		Assert.assertFalse(SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver).getText().contains("mensagem"));		
	}
	
	@Então("^verifico se é exibido o conteúdo \"([^\"]*)\"$")
	public void verifico_se_e_exibido_o_conteudo(String campo){ 		
		Assert.assertTrue(SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver)== null ? false : true);		
	}
	
	@Dado("^desseleciono no combo \"([^\"]*)\" a opção \"([^\"]*)\"$")
	public void desseleciono_no_combo_a_opção(String campo, String opcao) throws Throwable{
		Select dropdonw = new Select(SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver));
		dropdonw.deselectByVisibleText(opcao);
	}
	

	@Dado("^seleciono no radio button \"([^\"]*)\" o valor \"([^\"]*)\"$")
	public void seleciono_no_radio_button_o_valor(String campo, String opcao) throws Throwable {
	    SharedEnv.pageObject.getComponentePorNomeCampo(campo, new Object[]{opcao}, driver).click();
	}
	
	@Dado("^marco no \"([^\"]*)\" o valor \"([^\"]*)\"$")
	public void marco_no_o_valor(String campo, String opcao) throws Throwable {
	    SharedEnv.pageObject.getComponentePorNomeCampo(campo, new Object[]{opcao}, driver).click();
	}
	
	@Dado("^escrevo \"([^\"]*)\" \"([^\"]*)\" que atual$")
	public void escrevo_menor_que_atual(String campo, String opcao) throws Throwable {
	    SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver).clear();
	    Date data = new Date();
	    Integer hora = data.getHours();
	    hora = opcao.equals("MAIOR") ? hora + 1 : hora - 1;	    
	    SharedEnv.pageObject.getComponentePorNomeCampo(campo, null, driver).sendKeys(hora.toString());	    
	}
	
	@Então("^aguardo \"([^\"]*)\" segundos$")
	public void aguardo_segundos(String temp) throws Throwable {
	    SeleniumUtils.getDelay(Long.parseLong(temp));
	}
	
	@Então("^fecho o browser$")
	public void fecho_o_browser() throws Throwable {
		SeleniumUtils.getDelay(2);
	    driver.quit();
	}
	
}
