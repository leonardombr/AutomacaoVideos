package Utilitarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

	public static WebDriver getDriver() {
		//System.setProperty("webdriver.chrome.driver", "/SambaVideos/src/test/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
	
	public static WebDriver getDriverFireFox() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	public static WebElement getByXpathWithDelay(WebDriver driver, String xpath, long delay) {
		try {
			Thread.sleep(delay);
			return driver.findElement(By.xpath(xpath));
		} catch (Exception e) {
			return null;
		}

	}
	
	public static WebElement getByXpathWithExplicit(WebDriver driver, String xpath, long delay) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, delay);
			return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		} catch (Exception e) {
			return null;
		}

	}
	
	public static WebElement getByIdWithExplicit(WebDriver driver, String id, long delay) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, delay);
			return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
		} catch (Exception e) {
			return null;
		}

	}
	
	public static WebElement getByNameWithExplicit(WebDriver driver, String name, long delay) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, delay);
			return wait.until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
		} catch (Exception e) {
			return null;
		}

	}

	public static WebElement getByIdWithDelay(WebDriver driver, String id, long delay) {
		try {
			Thread.sleep(delay);
			return driver.findElement(By.id(id));
		} catch (Exception e) {
			return null;
		}
	}

	public static WebElement getByCssWithDelay(WebDriver driver, String css, long delay) {
		try {
			Thread.sleep(delay);
			return driver.findElement(By.cssSelector(css));
		} catch (Exception e) {
			return null;
		}
	}

	public static boolean getDelay(long delay) {
		try {
			Thread.sleep(delay*1000);
			return true;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
	}

}
