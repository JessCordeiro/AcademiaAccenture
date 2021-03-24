package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ValidadorSteps {

	public ValidadorSteps()
	{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		 browser= new ChromeDriver();
	}
	
	public WebDriver browser;	
	
	@Quando("eu acesso ao site tornese um programador")
	public void eu_acesso_ao_site_tornese_um_programador() {
			
			browser.get("https://www.torneseumprogramador.com.br/");
	    // Write code here that turns the phrase above into concrete actions
	 
	   
	}

	@Quando("digito no campo busca {string}")
	public void e_digito_no_campo_busca(String string) {
		
		WebElement campo=browser.findElement(By.cssSelector("input[name='q']") );
		campo.sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	 
	}


	@Quando("clico no botao de busca")
	public void clico_no_botao_de_busca() {
		WebElement input = browser.findElement( By.cssSelector(".btn-outline-dark") );
		input.click();
	}
	
	@Entao("devo ver o resultado na busca")
	public void entao_devo_ver_o_resultado_na_busca() {
		int input = browser.findElements( By.cssSelector(".div-card-aulas")).size();
		assertEquals(true,input>0);
		browser.quit();
	}

		
}

	

