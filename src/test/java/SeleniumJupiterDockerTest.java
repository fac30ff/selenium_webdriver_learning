import io.github.bonigarcia.DockerBrowser;
import io.github.bonigarcia.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.remote.RemoteWebDriver;

import static io.github.bonigarcia.BrowserType.ANDROID;
import static io.github.bonigarcia.BrowserType.CHROME;
import static io.github.bonigarcia.BrowserType.FIREFOX;

@ExtendWith(SeleniumExtension.class)
public class SeleniumJupiterDockerTest {
  @Test
  public void testChrome(
          @DockerBrowser(type = CHROME, version = "latest") RemoteWebDriver driver) {
    // use Chrome (latest version) in this test
  }

  @Test
  public void testFirefox(
          @DockerBrowser(type = FIREFOX, version = "60.0") RemoteWebDriver driver) {
    // use Firefox (version 60.0) in this test
  }

  @Test
  public void testAndroid(
          @DockerBrowser(type = ANDROID, version = "7.1.1") RemoteWebDriver driver) {
    // use Android (version 7.1.1) in this test
  }
}
