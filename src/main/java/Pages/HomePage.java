package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }
    WebElement carousel;
    WebElement trip;
    WebElement nextIcon;
    WebElement dateOfDeparture;
    WebElement searchForBusBtn;
    WebElement selectSeatsBtn;
    WebElement selectASeat;
    public void BookASeat() {
        carousel = driver.findElement(By.id("routeSlider"));
        nextIcon = driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/a[2]/span[1]"));
        nextIcon.click();
        trip = driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a"));
        trip.click();
        dateOfDeparture = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a"));
        dateOfDeparture.click();
        searchForBusBtn = driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", searchForBusBtn);
        searchForBusBtn.click();
        selectSeatsBtn = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[1]/div[1]/div[3]/div/input[4]"));
        selectSeatsBtn.click();
        selectASeat = driver.findElement(By.className("availSeatClassS"));
        js.executeScript("arguments[0].scrollIntoView();", selectASeat);
        selectASeat.click();
    }

}
