import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class A_Drivers {
  @Test
  public void a_CreateFirefoxDriverGeckoDriverOnPath() {
    WebDriver driver = new FirefoxDriver();
    driver.quit();
  }

  @Test
  public void a_CreateFirefoxDriverGeckoDriverUsingSystemProperty() {
    System.setProperty("webdriver.gecko.driver", "/Downloads/geckodriver");
    WebDriver driver = new FirefoxDriver();
    driver.quit();
  }

  @Test
  public void a_CreateChromeDriver() {
    WebDriver driver = new ChromeDriver();
    driver.quit();
  }

  @Test
  public void a_CreateSafariDriver() {
    WebDriver driver = new SafariDriver();
    driver.quit();
  }

  @Test
  public void a_CreateEdgeDriver() {
    System.setProperty("webdriver.edge.driver", "D:\\Downloads\\WebDriver\\MicrosoftWebDriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.quit();
  }

  @Test
  public void a_CreateIEDriver() {
    System.setProperty("webdriver.ie.driver", "C:\\Downloads\\WebDriver\\IEDriverService.exe");
    WebDriver driver = new InternetExplorerDriver();
    driver.quit();
  }
}
