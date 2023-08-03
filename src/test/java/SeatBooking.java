import BasePage.beforeTestSuite;
import Pages.HomePage;
import org.testng.annotations.Test;

public class SeatBooking extends beforeTestSuite {

    HomePage homePageObj;

    @Test
    public void BookASeat() {
        homePageObj = new HomePage(driver);
        homePageObj.BookASeat();
    }
}
