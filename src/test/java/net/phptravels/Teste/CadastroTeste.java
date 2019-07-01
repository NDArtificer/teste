package net.phptravels.Teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.pt.Quando;

public class CadastroTeste {

	public WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Denilson\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	//Metodo que realiza cadastro de um customer no site phptravels.
	
	@Test
	public void test() throws InterruptedException {
		
		//Fazer o login na pagina da phptravels
		driver.get("https://www.phptravels.net/admin-portal/admin");
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.name("email"));
		element.sendKeys("admin@phptravels.com");
		
		element = driver.findElement(By.name("password"));
		element.sendKeys("demoadmin");
		driver.findElement(By.className("btn")).click();
		Thread.sleep(3000);
		
		
		//Vai até a página de customers
		driver.get("https://www.phptravels.net/admin-portal/admin/accounts/customers");
		
		//Clicar na opção de adcionar um novo customer
		driver.findElement(By.className("add_button")).click();
		Thread.sleep(3000);
	
		
		// passando os paramentos que serão preenchidos nos campos.
		element = driver.findElement(By.name("fname"));
		element.sendKeys("Alex");
		
		element = driver.findElement(By.name("lname"));
		element.sendKeys("Green");
		
		element = driver.findElement(By.name("email"));
		element.sendKeys("alex_green@hotmail.com");
		
		element = driver.findElement(By.name("password"));
		element.sendKeys("123456");
		
		element = driver.findElement(By.name("mobile"));
		element.sendKeys("8888888888888");
		
		element = driver.findElement(By.name("country"));
		element.sendKeys("Brazil");
		
		element = driver.findElement(By.name("address1"));
		element.sendKeys("Rua 1");
		
		element = driver.findElement(By.name("address2"));
		element.sendKeys("Rua 2");
		Thread.sleep(3000);
		
		// clicar em salvar
		driver.findElement(By.className("btn-primary")).click();
		
		// volta para pagina de customers 
		driver.get("https://www.phptravels.net/admin-portal/admin/accounts/customers");
		Thread.sleep(3000);
	}
	

}
