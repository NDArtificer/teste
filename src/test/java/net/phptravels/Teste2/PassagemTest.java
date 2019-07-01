package net.phptravels.Teste2;

import java.text.ParseException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassagemTest {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Denilson\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void buscarPassagem() throws InterruptedException, ParseException {
	
	
		driver.get("http://www.phptravels.net");
		driver.findElement(By.className("fa-plane")).click();
		Thread.sleep(3000);
	

	
		driver.findElement(By.id("s2id_location_from")).click();

		WebElement element = driver.findElement(By.id("location_from"));
		element.sendKeys("Palmeres Airport");
		Thread.sleep(5000);
		driver.findElement(By.className("select2-result-selectable")).click();
		Thread.sleep(3000);

	
		driver.findElement(By.id("s2id_location_to")).click();
		element = driver.findElement(By.id("location_to"));
		element.sendKeys("Guarulhos Arpt");
		Thread.sleep(5000);
		driver.findElement(By.className("select2-result-selectable")).click();
		Thread.sleep(3000);

		
		element = driver.findElement(By.name("departure"));
		element.sendKeys("29-10-2019");
		Thread.sleep(5000);
		
		
		
		driver.findElement(By.className("clearfix"));
		driver.findElement(By.cssSelector("#flights > form > div.bgfade.col-md-3.col-xs-12.search-button > button")).click();
		Thread.sleep(5000);
	}

}
