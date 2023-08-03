package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class beforeTestSuite {
    public String URL = "https://ksrtc.in/oprs-web/guest/home.do?h=1";
    public static WebDriver driver;

    @BeforeSuite
    public void OpenBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get(URL);
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void CloseBrowser(){
        driver.quit();
    }
}
